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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1L", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "91", "92", "2147483646"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483587", "-1073733688"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.5em00", "<sample:6>"}}, 1), new String[][]{{"getLongValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1310848", "-4194215"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "252", "0"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}, 3), new String[][]{{"getCurrentName", "", "3"}, {"getTokenColumnNr", "", "1"}, {"hasTextCharacters", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "5.", "-1.0737418240000002E9"}, {"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "0x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-1073741824, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcept...#439#-289420426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getShortValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "Obje3", "1.8446744073709552E19"}, {"com.fasterxml.jackson.core.base.ParserBase", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=18446744073709552000, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!NullPo...#459#-1175243049", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.5d", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:6>", "2147483646", "2147483610"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "byte[],java.lang.String", "<sample:2>", "-"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "90"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-655816865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getIntValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"252", "\u00e9"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "reportOverflowInt", "java.lang.String", "\u00e9"}, {"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.Writer", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 44, 98, 44, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"-4", "010"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getNumberValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "skipChildren", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "requiresCustomCodec", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenLineNr", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#2115476084", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:7>", "-", "-2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "124"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ...#376#1090564990", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"1.25", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "finishToken", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "overrideStdFeatures", "int,int", "-2147483647", "12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "F"}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "1.240.5e300", "-46.5"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-46, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=-46, getCurrentName=null...#391#1870730643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "T"}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "1.240.5e300[Integer with %d digits]", "0.0"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=null, ge...#372#909521576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "T"}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "1.1234567890123456", "0.0"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=null, ge...#372#909521576", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "'"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDecimalValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "(/2147483647", "-9.223372036854776E18"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-9223372036854775808, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!NullPo...#458#-609678736", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"21bF474733646", "-4.294967296E9"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-4294967296, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!NullPointerExce...#452#-330937279", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getNumberValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "isExpectedStartArrayToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "isNaN", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "resetInt", "boolean,int", "true", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "252", "-2147483647", "2147483646"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportMissingRootWS", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:1>", "-268435455", "1", "1.1234577890123456"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportUnexpectedChar", "int,java.lang.String", "90", "X--1"}}), new String[][]{{"close", "", "6"}, {"close", "", "5"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "4"}, {"getTextCharacters", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1798319432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTextLength", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:11>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "J"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:0>", "39", "80"}}, 2), new String[][]{{"getValueAsString", "java.lang.String", "0"}, {"getLastClearedToken", "", "0"}, {"getValueAsInt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-840124826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:11>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "J"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:0>", "39", "80"}}, 2), new String[][]{{"getValueAsString", "java.lang.String", "0"}, {"getLastClearedToken", "", "0"}, {"getValueAsInt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#912725502", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsInt", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_getByteArrayBuilder", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsLong", ""}}, 3), new String[][]{{"getValueAsString", "java.lang.String", "1"}, {"clearCurrentToken", "", "2"}, {"getValueAsDouble", "", "6"}, {"currentTokenId", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-607920123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", " ", "Infinity"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!NumberFormatException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!Null...#443#-140104662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "10"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:11>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_longNumberDesc", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"!", "1.0737418235E9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1073741823, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#428#-832987449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"-2147483638", "NaN"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:9>"}, {"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:6>", "80", "-20"}, {"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToDouble", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!NumberFormatException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, ge...#403#1169456298", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTokenId", "int", "93"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "reportOverflowLong", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_throwInvalidSpace", "int", "13"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "reportUnexpectedNumberChar", "int,java.lang.String", "2147483646", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "close", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "close", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "91", "126", "1073741823"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "252", "528482344"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "221", "528482344"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1812569577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"92", "39"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "Current token ("}, {"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:0>", "11", "35"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#467#1060581571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#467#1060581571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"92", "39"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "-2.147483648E9"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-304192159", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-304192159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"156", "39"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"156", "39"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "-2.147483648E9"}, {"com.fasterxml.jackson.core.base.ParserBase", "readValueAs", "java.lang.Class", "<sample:1>"}}, 1), new String[][]{{"getSchema", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-304192159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"252", "268435507"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValueAs", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}}, 1), new String[][]{{"getFeatureMask", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"504", "268435470"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "readValueAs", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}}, 1), new String[][]{{"getFeatureMask", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_codec", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"504", "268433422"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"501", "1073733688"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}}, 1), new String[][]{{"getFormatFeatures", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2", "1073733688"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}}, 1), new String[][]{{"getCurrentValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-4", "1073733688"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "reportOverflowInt", ""}}, 1), new String[][]{{"getCurrentValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-4", "-1073733688"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.5e300", "<sample:6>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "reportOverflowInt", ""}}, 1), new String[][]{{"getCurrentValue", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1869570157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.Writer", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleEOF", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1784069287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleEOF", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleEOF", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-1407026369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1048615", "-2147483647"}, false, 0, null, 3), new String[][]{{"getTokenColumnNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"32", "-2147483648"}, false, 1, new String[][]{}, 3), new String[][]{{"getTokenColumnNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"40", "2147483647"}, false, 1, new String[][]{}, 3), new String[][]{{"getValueAsString", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-20", "2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "125"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "0"}}, 3), new String[][]{{"getValueAsString", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-20", "2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "114"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "0"}, {"com.fasterxml.jackson.core.base.ParserBase", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"14"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2146435071"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "57"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "0"}}, 3), new String[][]{{"getFloatValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2146435071"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTokenId", "int", "1"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "57"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "0"}}, 3), new String[][]{{"getText", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"65583", "1073217534"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTokenId", "int", "1"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "228"}}, 3), new String[][]{{"getObjectId", "", "3"}, {"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-536805329", "1073217534"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "currentToken", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "4503599627370610"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}, 3), new String[][]{{"getObjectId", "", "3"}, {"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1048674", "32"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "31", "0"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}, 3), new String[][]{{"getCurrentName", "", "3"}, {"getTokenColumnNr", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1048702", "-1048558"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "31", "0"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}, 3), new String[][]{{"getCurrentName", "", "3"}, {"getTokenColumnNr", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "-1073741824", "0"}}, 3), new String[][]{{"getEmbeddedObject", "", "3"}, {"getTokenColumnNr", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.base.ParserBase", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.base.ParserBase", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.base.ParserBase", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "39"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "overrideCurrentName", "java.lang.String", "12:30:45"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#470#1997658310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"[Integer with %d digits]"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidNumber", "java.lang.String", "2147483647"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "TITLE", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getNumberValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1869570157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1784069287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportError", "java.lang.String", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "skipChildren", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "T aITLE", "<null>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsInt", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "T aITLE", "<sample:0>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsInt", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1812569577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getTypeDesc", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getTypeDesc", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ROOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "252", "268435455"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsLong", "long", "31"}, {"com.fasterxml.jackson.core.base.ParserBase", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "252", "268435455"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:4>", "38", "34"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsLong", "long", "31"}, {"com.fasterxml.jackson.core.base.ParserBase", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "252", "268435455"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:3>", "38", "34"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsLong", "long", "31"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "252", "536870910"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "252", "528482302"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"92", "39"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "Current token ("}, {"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:0>", "11", "35"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#467#1060581571", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#467#1060581571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:2>", "33", "32"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1812569577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-718202777", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleEOF", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "isExpectedStartArrayToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "finishToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"9", "34"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"1048588", "10"}, false), new String[][]{{"getByteValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1048645", "-2147483647"}, false), new String[][]{{"getTokenColumnNr", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "114"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "0"}}), new String[][]{{"getValueAsString", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "2146435071"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTokenId", "int", "1"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "114"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getEmbeddedObject", ""}}), new String[][]{{"getObjectId", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "1073217534"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "4503599627370610"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}), new String[][]{{"getObjectId", "", "3"}, {"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", "java.lang.String", "[Integer with %d digits]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483610", "1073217534"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "1"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "32", "0"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}), new String[][]{{"getObjectId", "", "3"}, {"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483610", "1073217499"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "1"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "16", "0"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", ""}}), new String[][]{{"getObjectId", "", "3"}, {"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_finishString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "-1073741824", "0"}}), new String[][]{{"getEmbeddedObject", "", "3"}, {"getTokenColumnNr", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"-4"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"90"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "setRequestPayloadOnError", "java.lang.String", "null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValuesAs", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "reportOverflowInt", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "+1", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{" in a Number value", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:5>"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1784069287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"125", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}, {"com.fasterxml.jackson.core.base.ParserBase", "nextIntValue", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "TITLE", "<null>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "TITLE", "<null>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "T aITLE", "<empty>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsInt", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1784069287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "T aITLE", "<empty>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsInt", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-1407026369", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "T aITLE", "<empty>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsInt", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "finishToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getSchema", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"91", "i"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_decodeEscaped", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"34"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("34.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"34"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483587"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("34.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-815607761", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"92"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483587"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("92.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-815607761", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"33.999999999999986"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483587"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("33.999999999999986", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-815607761", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"3.3999999999999986"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483587"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.3999999999999986", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-815607761", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"3.3999999999999986"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483640"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.3999999999999986", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#1296708077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483640"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#1296708077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"4.6116860184273879E18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.6116860184273879E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-4.6116860184273879E18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.6116860184273879E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-4.6116860184273879E18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483643"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.6116860184273879E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1614164944", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-4.6116860184273879E18"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.6116860184273879E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-2.30584300921369408E17"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentLocation", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.30584300921369408E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-2.30584300921369408E17"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483623"}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentLocation", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.30584300921369408E17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1585664654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483623"}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentLocation", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1585664654", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{".10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"Unexpected end-of-input"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Unexpected end-of-input", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12345678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1.12344678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12344678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1.12346678901234567"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12346678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1.12346678901234567"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.12346678901234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"I"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("I", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getTokenColumnNr", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String", "TITLE"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideStdFeatures", "int,int", "31", "123"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-1540607002", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideStdFeatures", "int,int", "-27", "123"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#1917649920", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_constructError", "java.lang.String,java.lang.Throwable", "Illegal character '", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_longNumberDesc", "java.lang.String", "0x1F"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "skipChildren", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1784069287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_longNumberDesc", "java.lang.String", "0x1F') as "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_longNumberDesc", "java.lang.String", "0x1F') as "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#848156961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1869570157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "[Integer with %d digits]", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-2147483648, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcept...#434#-1433129329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsLong", new String[]{"long"}, new String[]{"2147483646"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getCodec", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_decodeEscaped", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_codec", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getFloatValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"124"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportTooLongIntegral", "int,java.lang.String", "123", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_finishString", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "I", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"126", "2147483587"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-2139845176", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-2139845176", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", ") in base64 content", "-5.368709409695E8"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-536870940, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#431#-1065485867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", ") in base64 bontent", "-5.368709409925E8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-536870940, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#431#-913804089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", ") in base64 bontent", "-5.368709409925E8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-536870940, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#431#739712703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", ") in base64 bontent", "-5.368709409925E8"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-536870940, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#432#905655834", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"-1", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
}
