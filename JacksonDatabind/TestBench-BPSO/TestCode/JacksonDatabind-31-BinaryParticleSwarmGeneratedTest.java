package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false), new String[][]{{"getCodec", "", "4"}, {"version", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=4, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=159, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, ...#215#1212572350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-15", "<i:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-780700730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "2147483647"}}), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"3L1", "-131079", "50"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-131058", "<i:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<s:/>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#213#86924352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}), new String[][]{{"getTextOffset", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "Current token (", "<s:keya>"}}), new String[][]{{"hasCurrentToken", "", "5"}, {"hasTextCharacters", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current token (), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, ...#262#579728312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"-1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutput...#228#546741556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String,int,int", "5.a,b,c", "131058", "1073741827"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}}), new String[][]{{"getCurrentToken", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<null>"}}), new String[][]{{"isClosed", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-1262747703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"nnull", "1", "1"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(PT1H), START_OBJECT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=...#265#-835498543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "abc", "8.988465674311579E306"}}), new String[][]{{"getParsingContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(abc), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, get...#259#1680485269", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-131108", "<s:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, get...#234#791096267", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "2147483584"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "java.lang.String", "-1--1{\"a\":1}"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFe...#272#1039452319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ...#237#-1298693260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:0>", "0", "1"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.1234567Title", "-3.5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567Title), VALUE_NUMBER_FLOAT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, ge...#281#980262047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "010"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(010), START_OBJECT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHigh...#255#-940639334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,float", "0xFFFFFFFF", "-1.0"}}), new String[][]{{"writeNumber", "double", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormat...#274#1745090694", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormat...#274#1745090694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:10>"}}), new String[][]{{"getTextLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<d:12.8>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=12.8]VALUE_EMBEDDED_OBJECT[objectId=12.8], END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormat...#274#-1396758912", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", ""}}), new String[][]{{"close", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:3>"}}), new String[][]{{"getTypeId", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getCodec", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "PTH"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHi...#257#1505905406", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}}), new String[][]{{"setCurrentValue", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-747156240", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-747156240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"a,b,c", "-31", "5"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "Currentztoken (", "16"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", ".5f", "-9223372036854775808"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Currentztoken (), VALUE_NUMBER_FLOAT, FIELD_NAME(.5f), VALUE_NUMBER_INT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTyp...#312#-1299077272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", "java.lang.String,java.lang.String", "-1.5", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1.5), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#456261432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "1.5f5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5f5.), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=15, getFormatFeatures=0, getHighestEscaped...#245#-2083588007", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "-65539"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-1262747703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:9>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:6>", "<s:>"}}), new String[][]{{"getEmbeddedObject", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<i:-17>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#-1884416106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}}, 1), new String[][]{{"getTextCharacters", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", "java.lang.Object", "<i:0>"}}), new String[][]{{"getObjectId", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<b:false>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<i:-7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [typeId=-7]END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1398906748", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}}), new String[][]{{"getTokenLocation", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: N/A; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}), new String[][]{{"nextFieldName", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#208581228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "Current token (abc"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:0>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"close", "", "6"}, {"nextFieldName", "com.fasterxml.jackson.core.SerializableString", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "1.0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1711708972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "3.4028235E38"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"PTH"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(PTH), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#-895054540", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "r[1,2]2020-01-01", "72057594037927935"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(r[1,2]2020-01-01), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ge...#260#1608865546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#344648965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-16777216", "-20"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 2), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "4"}, {"getFormatFeatures", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=-16777197, getFormatFeatures=0, getHighestEscapedCh...#243#1576376324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "1.123456D"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.123456D), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#824248871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "8", "1073741823"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#1613837115", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#1613837115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-87735062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=23, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-87735062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"020-01-01", "-57"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(020-01-01), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#-25081265", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", "int", "6"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#213#86924352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:2>", "<s:b>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#223#-1116708707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", ".>5"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.>5), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCh...#243#1325867277", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"1.1,2344678", "32.0"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1,2344678), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHigh...#255#1985124624", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-131098", "<s:/k>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "0", "<s:e>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:7>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-1150619020", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "{\"za\":1}", "-1"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#-279921110", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME({\"za\":1}), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#1242488711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-56>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-131058", "16777280"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16777247, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered...#220#-979947932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16777247, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered...#220#-979947932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:1>", "<d:14.973>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-1262747703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<s:nkbey>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscap...#247#1175158480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-327652", "<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:2>", "<s:b>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NULL, START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEs...#250#-2121878651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"char"}, new String[]{"\uffff"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:0>", "<sample:1>", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"2", "-1125899906842625"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscaped...#245#1729674443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-1073741792", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "s010"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-131058", "-262042"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "0xFFFFFFFF", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-262113, getFormatFeatures=0...#264#-560308480", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0xFFFFFFFF), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-262113, getFormatFeatures=0...#264#-560308480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:7>", "<b:false>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<sample:5>", "-2147418112", "131058"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"", "Infinity"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-446794494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<s:keya>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getF...#279#127742370", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "QT1H"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", "com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext", "<sample:9>", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#1960799229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "-20"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#234#-856350686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,java.math.BigDecimal", "a b", "-10"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(a b), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#761340135", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#761340135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", "java.lang.Object", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#661208038", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#211#1796179228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", "java.lang.Object", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"2147483584", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "0x12345678z9", "-65529"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x12345678z9), VALUE_NUMBER_INT, FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatur...#293#-1960332376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"[type\nId=\n"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME([type\nId=\n)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, get...#234#-1616090015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:9>", "<s:\u00e9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,double", "0x123456788", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x123456788), VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFor...#277#1024889574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"-04"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "5."}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<empty>", "2147483647", "-536739838"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(5.), FIELD_NAME(-04)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscaped...#245#-2128453275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:0>", "<s:->"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"short"}, new String[]{"9"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutput...#228#546741556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "append", "com.fasterxml.jackson.databind.util.TokenBuffer", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#-279921110", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1), new String[][]{{"getCurrentToken", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"2147483646", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "-2147483598", "1073741823"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"NaN"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:6>", "<sample:1>", "50", "131079"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"2 ... (truncated "}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2 ... (truncated ), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHi...#257#24259880", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"float"}, new String[]{"NaN"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<sample:1>", "-268369919", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2023557407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canOmitFields", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:2>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-747156240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1268912675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1.1,2344678", "-65529"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "A\"a\":1}\u00e9", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(A\"a\":1}\u00e9), VALUE_EMBEDDED_OBJECT, FIELD_NAME(1.1,2344678), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, ge...#300#-1257814611", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:2>", "<sample:2>", "-131058"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", "java.lang.String", "/a/ba,b,c"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "8194", "524288"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"+ "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "-16781313", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(+ ), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#2022124469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"0x12345", "16"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x12345), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestE...#251#-2006811790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"\nTITLE"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\nTITLE)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#-1863701140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"3", "268369919", "16"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#-279921110", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"Title", "8192"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Title), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1726649083", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:b_b>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "4", "-10"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:3>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{"int"}, new String[]{"-2147483584"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#1960799229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-268369919", "<s:b>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "16", "1073741823"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", new String[]{"char"}, new String[]{"\000"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "0"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_append", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:5>", "<d:15.0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.6.4-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=6, getPatchLevel=4, isSnapshot=true, isUknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, FIELD_NAME(15.0)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#-787646417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[]", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483647", "-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#1553937850", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#1553937850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#-1884416106", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#-1884416106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuf...#225#1960799229", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<sample:0>", "-2147483648", "-26"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#399719329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", "byte[],int,int", "<sample:1>", "12", "-1879048188"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "16777217"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscape...#246#-1488604369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "1.1234567901234567", "17"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1234567901234567), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#-667196049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:3>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "1bL"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1bL)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#-425023801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:8>", "<s:c>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-0.021"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#1907094488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"16"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=27, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-1157210942", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=27, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-1157210942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#764265398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"15", "<i:-29>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "-1", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1), VALUE_EMBEDDED_OBJECT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0,...#263#1391634301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setFeatureMask", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1486398552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "char[],int,int", "<sample:1>", "16777201", "-52"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "useDefaultPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"-1", "335478783"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(-1), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#248278357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "1F-5", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=1F-5, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1F-5), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#210011416", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:3>", "<s:.La>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#223#399719329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=29, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#1179181568", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=29, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#1179181568", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<sample:1>", "45", "-15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", "itle", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(itle), VALUE_NUMBER_INT, VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ge...#260#2025163169", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "NaN"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1472188584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#-1334289400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"int"}, new String[]{"64"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"j020-01--01"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(j020-01--01)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ...#237#1071320983", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", ".6"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.6), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0...#239#1816871172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:B>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "#"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:9>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=1]END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#2114605062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"", "aa"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "X"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=...#240#-235900531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#208581228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#213#86924352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-50", "805306367"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=true, canReadTypeId=true, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurrent...#459#-279921110", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=15, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#394311911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<d:42.944>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#896880715", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#896880715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "char[],int,int", "<sample:0>", "-15", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(12:30:45)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#-392693703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:6>", "<s:key>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1.5", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", "java.lang.String", "12:30_4516"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT, FIELD_NAME(1.5), VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeat...#270#-1709494413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"0", "<s:b_b>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:6>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "firstToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{""}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, g...#236#-1442850841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", ".1", "15"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.1), VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeature...#267#-1536405362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"Current tken ("}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(Current tken ()] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=...#240#-1662858005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectId", "java.lang.Object", "<d:429.44000000000005>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: [objectId=429.44000000000005]START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighest...#252#-1776346292", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_reportError", new String[]{"java.lang.String"}, new String[]{", 11"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:0>", "<s:ody>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#249#-1268912675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:b_b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinary", "byte[],int,int", "<empty>", "-2147483648", "20"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#208581228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsc...#248#-1135867348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "int", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1316905765", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "toString", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#222059518", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", "byte[],int,int", "<null>", "2147483647", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#896880715", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#896880715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[TokenBuffer: ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"http:/.example.com/a?b=c"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(http:/.example.com/a?b=c), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#-1489198660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{".", "0"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscaped...#245#1743028576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "http://example.com/a?bP=c"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer$Parser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighest...#252#1945313701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.lang.String"}, new String[]{"0x12345"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "48", "<d:15.0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<sample:0>", "2147483647", "-15"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1515238608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-268369919"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "16777217", "-131098"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", "com.fasterxml.jackson.core.JsonGenerator", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<d:-42.944>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-268369868", "<s:ay>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY, START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, g...#236#-244422980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:9>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"-30", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:1>", "<b:true>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:4>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeArrayFieldStart", "java.lang.String", "ab\"cI"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: FIELD_NAME(ab\"cI), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-778182825", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(ab\"cI), START_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedC...#244#-778182825", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "long", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighes...#253#1908269132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "serialize", new String[]{"com.fasterxml.jackson.core.JsonGenerator"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeRaw", "char[],int,int", "<null>", "0", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"long"}, new String[]{"-2097153"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", "com.fasterxml.jackson.core.JsonToken,java.lang.Object", "<sample:0>", "<s:c>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", new String[]{"int", "java.lang.Object"}, new String[]{"40", "<d:5.1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT, END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCha...#242#-766791417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.11,23446E78"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "\037... (truncated "}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(\037... (truncated ), VALUE_NULL, FIELD_NAME(1.11,23446E78)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, ge...#281#2129576621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_INT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutput...#228#546741556", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.math.BigDecimal", "1E+100"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighest...#252#1945313701", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#211#1796179228", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:4>", "<b:false>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeStartObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-187258294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeString", "char[],int,int", "<sample:2>", "21", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-1950792977", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=95, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-1950792977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-131109", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_FALSE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffe...#222#771856111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffer...#222#-822200350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483618"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "setCurrentValue", "java.lang.Object", "<i:1>"}}), new String[][]{{"getCurrentValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", "java.lang.String", "1.123456789012345672020-01-01"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "a b;T1H", "<s:c>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(a b;T1H), VALUE_EMBEDDED_OBJECT, FIELD_NAME(GeneratedTestInputProxy)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatur...#293#1733854469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"\0100x123456789"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeFieldName", "java.lang.String", "2020-"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(2020-), FIELD_NAME(\0100x123456789)] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHi...#257#1974764785", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "deserialize", new String[]{"com.fasterxml.jackson.core.JsonParser", "com.fasterxml.jackson.databind.DeserializationContext"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "forceUseOfBigDecimal", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_throwInternal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeBinaryField", "java.lang.String,byte[]", "-0.0", "<empty>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", "byte[],int,int", "<sample:0>", "0", "15"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:7>", "<s:F>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "_appendRaw", "int,java.lang.Object", "-15", "<s:b_b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBu...#226#2057815589", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"true", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT, FIELD_NAME(true), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#-324479061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", new String[]{"java.lang.String"}, new String[]{"z.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(z.5e300), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscaped...#245#1606387548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", "int,int", "2147483647", "8388595"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#-674994804", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "21(4748368"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(21(4748368), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEsca...#248#1807491646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "java.lang.String", "`aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"getEntryCount", "", "0"}, {"getTypeDesc", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#1064130365", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,long", "1.5e400", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e400), VALUE_NUMBER_INT, VALUE_STRING] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0,...#263#-1374461811", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"1.1c>34567", "10.0"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.1c>34567), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighe...#254#1054014208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffere...#221#-1384764006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"11234.678"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNullField", "java.lang.String", "P_T1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(P_T1H), VALUE_NULL] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCh...#243#179920783", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_TRUE] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuff...#224#344648965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCharacterEscapes", ""}}), new String[][]{{"hasTokenId", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-268369919", "-26"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getOutputTarget", ""}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectFieldStart", "java.lang.String", "`bc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(`bc), START_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar...#241#-1892707851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getO...#233#508168395", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"1.5e20", "7.991"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(1.5e20), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighest...#252#-896696521", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_append", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:6>", "<s:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, ge...#235#-1193830745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{" ... (truncated ", "2E+100"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME( ... (truncated ), VALUE_NUMBER_FLOAT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ...#262#-2104621942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "asParser", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getFeatureMask", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, isC...#212#-569782035", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: VALUE_NUMBER_FLOAT, END_ARRAY] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedCh...#243#1949246542", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeObjectField", "java.lang.String,java.lang.Object", "0x123456789", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(0x123456789), VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, ge...#259#698345346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "append", new String[]{"com.fasterxml.jackson.databind.util.TokenBuffer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "-9", "20"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumber", "float", "63.6"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "getFormatFeatures", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendValue", new String[]{"com.fasterxml.jackson.core.JsonToken", "java.lang.Object"}, new String[]{"<sample:6>", "<i:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "writeNumberField", "java.lang.String,int", ".1", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[TokenBuffer: FIELD_NAME(.1), VALUE_NUMBER_INT, VALUE_EMBEDDED_OBJECT] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=true, canWriteTypeId=true, getFeatureMask=31, getFormatFeature...#267#-1536405362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-8"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "flush", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.util.TokenBuffer", actual.getClass().getName());
  assertEquals("[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[TokenBuffer: ] {canOmitFields=true, canWriteBinaryNatively=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=31, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-1, i...#214#-2017075639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.util.TokenBuffer", "com.fasterxml.jackson.databind.util.TokenBuffer", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.util.TokenBuffer", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}, {"com.fasterxml.jackson.databind.util.TokenBuffer", "canWriteObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
