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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenLineNr", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_hasTextualNull", "java.lang.String", "Ille:gal character '"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMismatchedEndMarker", new String[]{"int", "char"}, new String[]{"-39", "\001"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isNaN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getLongValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInvalidSpace", "int", "9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"K", "<i:-4>", "<i:19>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwUnquotedSpace", "int,java.lang.String", "25", "["}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_wrapError", "java.lang.String,java.lang.Throwable", "' (code 00x", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:9>"}, {"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "Tisle", "-2.147483647944E8"}, {"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-214748364, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#432#1802570995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_closeInput", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "\037in a value", "<sample:1>", "<sample:3>"}, {"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"o"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[111]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "currentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reset", "boolean,int,int,int", "false", "94", "-33554406", "163"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"1."}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "20474836", "2.147483647E11"}}, 3), new String[][]{{"printStackTrace", "", "5"}, {"getRequestPayloadAsString", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=214748364700, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!NullPointerExc...#444#-1644619802", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowLong", "java.lang.String", "`b0"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportUnexpectedNumberChar", "int,java.lang.String", "-55", "-2.14783648E9 in "}}), new String[][]{{"appendFourBytes", "int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=4, size=4}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"Illesgal charactes '"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenColumnNr", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "Illegal c in a Number value", "-9.223372036854776E19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-92233720368547760000, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!NullP...#459#614600941", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "16", "-38", "-2147483620"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideStdFeatures", "int,int", "-2", "16777203"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsDouble", "double", "2.1474836479999998E9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}-92233720h36854775808"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwUnquotedSpace", "int,java.lang.String", "70", "[Integer with %d digits]"}, {"com.fasterxml.jackson.core.base.ParserBase", "hasTokenId", "int", "-33554406"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\":1}-92233720h36854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<sample:0>", "31"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
  assertEquals("[-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "0x123456789-2.147483648E9", "<sample:8>", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getNumberValue", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "canReadTypeId", ""}}, 2), new String[][]{{"getValueAsDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "-,1", "-2.147483648E9"}, {"com.fasterxml.jackson.core.base.ParserBase", "getNumberType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "b", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFloatValue", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "clearCurrentToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMore", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reset", "boolean,int,int,int", "false", "-2147483646", "4", "6"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:1>", "128", "-2147483364"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_longNumberDesc", "java.lang.String", "K--1"}, {"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int", "java.lang.String"}, new String[]{"<sample:0>", "-1970", "70", "f."}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "setCurrentValue", "java.lang.Object", "<i:12>"}}), new String[][]{{"addSuppressed", "java.lang.Throwable", "7"}, {"getStackTrace", "", "7"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.StackTraceElement;", actual.getClass().getName());
  assertEquals("[com.fasterxml.jackson.core.base.ParserBase.reportInvalidBase64Char(ParserBase.java:1135), java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method), java.base/jdk.internal.reflec...#865#2098585269", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "<"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsInt", "int", "67108739"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#782970773", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#782970773", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-5"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "\037", "<sample:0>", "<sample:5>"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowInt", "java.lang.String", "114748364"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:1>", "=", "-2147483648"}}, 2), new String[][]{{"currentTokenId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"-9.223372036854776E18-2147483648", "<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTokenId", "int", "0"}}), new String[][]{{"getLocalizedMessage", "", "6"}, {"fillInStackTrace", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: -9.223372036854776E18-2147483648\n at [Source: (Integer); line: 1, column: 1] {getLocalizedMessage=-9.223372036854776E18-2147483648\n at [Source: (Integer)...#464#2134877502", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "'"}, {"com.fasterxml.jackson.core.base.ParserBase", "getFeatureMask", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483644", "-2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentValue", ""}}), new String[][]{{"getTokenCharacterOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"Illegal c in a Number value", "-0.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:6>", "2147483647", "46"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=null, ge...#374#-892600638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"20474836"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#460#1247209759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportMissingRootWS", "int", "2147483593"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "resetAsNaN", new String[]{"java.lang.String", "double"}, new String[]{"UUnexpected end-of-input in a Number value", "NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsString", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!NumberFormatException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, ge...#393#-1997300160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"94"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 1), new String[][]{{"getValueAsLong", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-242013597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isNaN", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_codec", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_parseNumericValue", "int", "128"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsInt", "int", "1073741823"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String", ".5d"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "Current token (", "-0.0"}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentToken", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=null, ge...#374#-848336568", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"1.12345671M", "<sample:0>", "<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "currentName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFloatValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"-15"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\ufff1' (code -15)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}, 2), new String[][]{{"getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportUnsupportedOperation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"", "<i:1>", "<i:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:3>", "39", "11"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getEmbeddedObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reset", "boolean,int,int,int", "true", "2147483647", "46", "-16294"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTextOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:7>", "a", "-16347"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{".5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#454#-1761059970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:6>", "'", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleUnrecognizedCharacterEscape", "char", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"+1A"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOF", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{".5", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getCurrentToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: .5\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=.5\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=.5\n at [Source: UNKNOWN; line:...#366#-721088041", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String", "1.5e00"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.OutputStream", "<null>"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", "java.lang.String", "a,a,c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{".5", "<sample:7>", "<sample:2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"abwf", "<sample:1>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: abwf\n at [Source: UNKNOWN; line: 1, column: 10] {getLocalizedMessage=abwf\n at [Source: UNKNOWN; line: 1, column: 10], getMessage=abwf\n at [Source: UNKNOW...#377#-230354335", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetFloat", "boolean,int,int,int", "true", "2147483647", "180", "-15858"}, {"com.fasterxml.jackson.core.base.ParserBase", "getDoubleValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reset", "boolean,int,int,int", "false", "-1", "29", "12"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"') as character #"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsBoolean", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:0>", "81", "-38"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getIntValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowInt", "java.lang.String", "1.123455678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String", "http://example.ccom/a?b=c"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getNonBlockingInputFeeder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "currentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getTextOffset", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsBoolean", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"32"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getObjectId", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getIntValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"false "}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValueAsTree", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOFInValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:5>", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTypeId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportTooLongIntegral", new String[]{"int", "java.lang.String"}, new String[]{"-16777203", "-2.14483648E9"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "skipChildren", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetInt", "boolean,int", "true", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: abc\n at [Source: UNKNOWN; line: 1, column: 12] {getLocalizedMessage=abc\n at [Source: UNKNOWN; line: 1, column: 12], getMessage=abc\n at [Source: UNKNOWN; ...#373#-1647337260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "nextIntValue", "int", "56"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "<a>b</a>", "<sample:7>", "<sample:0>"}, {"com.fasterxml.jackson.core.base.ParserBase", "_finishString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-2147482536"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getLastClearedToken", ""}}, 1), new String[][]{{"getNonBlockingInputFeeder", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValueAsTree", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasCurrentToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-6"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"02356789012345678901234567890"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_codec", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 02356789012345678901234567890\n at [Source: UNKNOWN; line: 1, column: 5] {getLocalizedMessage=02356789012345678901234567890\n at [Source: UNKNOWN; line: 1,...#456#-1313417700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_constructError", "java.lang.String", "{\"a\":1}"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowLong", "java.lang.String", "Unexpected end-of,input"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "isClosed", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_constructError", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.core.base.ParserBase", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}}, 3), new String[][]{{"getBigIntegerValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOF", "java.lang.String", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsDouble", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_longNumberDesc", "java.lang.String", "1E.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"-2.147483648E9"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "nextBooleanValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"*"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasTokenId", "int", "25"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getInputSource", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_codec", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getNonBlockingInputFeeder", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"25", "1E-61.25"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "close", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String", "UUnexpected end-of-input"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getLongValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1073741824>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"-9223372026854775808"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-9223372026854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"2147483637"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getParsingContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"-2147483624"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideFormatFeatures", "int,int", "-1073741824", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"0x1234567"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1f10", "<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "\t9.223372036854776E18", "<sample:4>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getDoubleValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwUnquotedSpace", "int,java.lang.String", "295", "1.25"}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "34", "F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"12", "1E-61.25"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_getByteArrayBuilder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOFInValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String,java.lang.Object", "9.223372036854776E18", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:7>", "(", "35"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "-1073741312", "128", "-2"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{" in]"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLongValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_getSourceReference", ""}}), new String[][]{{"getValueAsBoolean", "", "2"}, {"close", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"4"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportMissingRootWS", "int", "38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", "long", "184"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "canReadObjectId", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "resetInt", "boolean,int", "true", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"ab0", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "nextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_constructError", "java.lang.String", "\t"}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{".5", "<sample:6>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "releaseBuffered", "java.io.OutputStream", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsDouble", "double", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\uffff' (code 2147483647 / 0x7fffffff)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDoubleValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1E-5", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwInvalidSpace", "int", "1058"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 1E-5\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=1E-5\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=1E-5\n at [Source: UNKNOWN;...#374#-323716915", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_hasTextualNull", "java.lang.String", "{\"a\":1}-9223372036854775708"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "-9.223372036854786E8"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#482#292064616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "currentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleBase64MissingPadding", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483647", "21"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "nextIntValue", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportUnexpectedNumberChar", "int,java.lang.String", "33", "."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getShortValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-15858"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTokenId", "int", "38"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"0.5d"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "\t9.2%23371036854776E18", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1213863864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsBoolean", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToBigDecimal", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"Array"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String,java.lang.Object", "+a", "<b:false>"}, {"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowInt", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "T", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTokenLineNr", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTokenLineNr", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_constructError", "java.lang.String,java.lang.Throwable", "0", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "f1.5", "<sample:0>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getShortValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "isExpectedStartArrayToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_throwInternal", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"220-01-+1", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:3>", "g", "295"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"1.0234567890123455"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 1.0234567890123455\n at [Source: UNKNOWN; line: 1, column: 8] {getLocalizedMessage=1.0234567890123455\n at [Source: UNKNOWN; line: 1, column: 8], getMessag...#430#-1451168111", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToLong", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "_constructError", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getValueAsLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideCurrentName", "java.lang.String", "1."}, {"com.fasterxml.jackson.core.base.ParserBase", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#454#-247958572", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_longIntegerDesc", "java.lang.String", " "}, {"com.fasterxml.jackson.core.base.ParserBase", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"a,b-c"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_checkStdFeatureChanges", "int,int", "4", "-92"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<null>", "A", "-10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getText", "java.io.Writer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#1778866976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#1778866976", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "currentName", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1123456789", "<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"010-0.0", "<s:s>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:0>", "5", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setFeatureMask", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "hasTokenId", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"0", "<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"'ab", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getNumberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"02:30:45') as character #", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"'--0", "<sample:3>", "<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetInt", "boolean,int", "false", "2147483647"}, {"com.fasterxml.jackson.core.base.ParserBase", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "close", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:6>", "g", "-42"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_hasTextualNull", "java.lang.String", "2.147483647E9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"-214743648", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "overrideStdFeatures", "int,int", "9", "124"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "currentTokenId", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "loadMore", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"ab0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_handleEOF", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getNumberValue", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getInputSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getEmbeddedObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.147483648E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "0.5f", "<sample:6>", "<empty>"}, {"com.fasterxml.jackson.core.base.ParserBase", "isExpectedStartArrayToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportInvalidEOF", "java.lang.String", "S\u00e9"}, {"com.fasterxml.jackson.core.base.ParserBase", "hasTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.ReaderBasedJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1700553220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"262157", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTextOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"147"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "setCurrentValue", "java.lang.Object", "<i:-4>"}, {"com.fasterxml.jackson.core.base.ParserBase", "_finishString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("147", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "currentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFloatValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:4>", "-2147483644", "93", "1234567890123456789012345678901.5f"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}}), new String[][]{{"getValueAsBoolean", "boolean", "5"}, {"getBigIntegerValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_constructError", "java.lang.String", "\t9.22337202685d4776E18"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "_longNumberDesc", "java.lang.String", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"78"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_parseNumericValue", "int", "91"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getText", "java.io.Writer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("78", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_parseIntValue", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getLongValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"A"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportMismatchedEndMarker", "int,char", "-2147483648", "."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_parseNumericValue", "int", "-2147483637"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getValueAsInt", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"' (code 0x", "<i:13>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getLongValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getNonBlockingInputFeeder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"252"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_longIntegerDesc", "java.lang.String", "-1"}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFloatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}, 1), new String[][]{{"getArtifactId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "canParseAsync", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"toFullString", "", "5"}, {"isUknownVersion", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getTypeId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToDouble", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:6>", "-134217469", "-34"}}), new String[][]{{"getCurrentName", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "readValueAsTree", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "convertNumberToDouble", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "overrideFormatFeatures", "int,int", "4", "131137"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"0.12345678"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_handleEOF", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getFormatFeatures", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"76"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getCurrentName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("76", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwInvalidSpace", "int", "15858"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaa5aa", "<s:key>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_reportError", "java.lang.String,java.lang.Object", "4.", "<i:-2147483648>"}, {"com.fasterxml.jackson.core.base.ParserBase", "isClosed", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "skipChildren", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_throwUnquotedSpace", "int,java.lang.String", "25", "-1.1234567"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"1073741818", "Ob"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}, {"com.fasterxml.jackson.core.base.ParserBase", "getBigIntegerValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "currentName", ""}, {"com.fasterxml.jackson.core.base.ParserBase", "getCurrentValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getNumberType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "convertNumberToBigDecimal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "_reportError", "java.lang.String,java.lang.Object", "abc", "<s:uk3y>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "clearCurrentToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"39", "Invalid numesi9c value: "}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "_longNumberDesc", "java.lang.String", "{\"a\":1}-9223372036854775807"}, {"com.fasterxml.jackson.core.base.ParserBase", "nextIntValue", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "isClosed", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "finishToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "resetAsNaN", "java.lang.String,double", "]", "123"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=123, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=123, getCurrentName=null...#382#1933656999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "nextLongValue", "long", "40"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "getTextCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:10>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:3>", "8", "-262149"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.ParserBase", "reportInvalidNumber", "java.lang.String", "Invwlid numeric\037value: "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.ParserMinimalBase", "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "isNaN", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.ParserMinimalBase", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.base.ParserMinimalBase", "getDoubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1688493784", SearchInputFactory_scaffolding.receiverState());
 }
}
