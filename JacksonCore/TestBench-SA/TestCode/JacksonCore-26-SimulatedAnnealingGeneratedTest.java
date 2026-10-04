package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#1579965875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:2>", ""}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberMinus", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:4>", "3", "10", "PT1H"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<null>", "10", "3"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#666195254", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNegativeNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("PT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", new String[]{}, new String[]{}, false, 38, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "releaseBuffered", "java.io.OutputStream", "<sample:1>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#468#1435254954", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", new String[]{"boolean", "int"}, new String[]{"true", "-2147483584"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdToken", "int,int", "3", "1073741823"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", "boolean,int", "false", "55297"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startAposString", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", "boolean,int", "true", "4"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "false", "54"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#466#1397550007", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"nadI"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<sample:4>", "-6", "55295"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<sample:0>", "56321", "4"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextLength", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishTokenWithEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberMinus", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getShortValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNullToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#466#1397550007", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", "int,int", "2", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "finishToken", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#466#-1927126282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"2020-01-01", "0", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_addName", "int[],int,int", "<null>", "-6", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"-110472"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "needMoreInput", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "-48"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-110472", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#466#427259000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "needMoreInput", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", "int,int", "2", "-6"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#-1994705891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setFeatureMask", new String[]{"int"}, new String[]{"55257"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextLongValue", "long", "118"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", ""}}), new String[][]{{"getValueAsLong", "long", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-650727021", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNonBlockingInputFeeder", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int,int", "65535", "65535", "65535"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "225252"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", "int", "4"}}), new String[][]{{"getText", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"PT1H", "<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: PT1H\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=PT1H\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=PT1H\n at [Source: UNKNOWN;...#374#1295483951", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"BT1H", "<null>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: BT1H\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=BT1H\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=BT1H\n at [Source: UNKNOWN;...#374#109565139", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"BTT1", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: BTT1\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=BTT1\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=BTT1\n at [Source: UNKNOWN;...#374#490207175", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"true", "<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}}, 2), new String[][]{{"getSuppressed", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"true", "<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}}, 2), new String[][]{{"getSuppressed", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"ab", "<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}}, 2), new String[][]{{"printStackTrace", "", "2"}, {"withRequestPayload", "com.fasterxml.jackson.core.util.RequestPayload", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: ab\n at [Source: UNKNOWN; line: 1, column: 1]\nRequest payload : a {getLocalizedMessage=ab\n at [Source: UNKNOWN; line: 1, column: 1]\nRequest payload.., get...#419#540948239", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"{aba,b,c1234567890123456789012345678905.", "<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "true", "55297"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}}, 2), new String[][]{{"printStackTrace", "", "2"}, {"withRequestPayload", "com.fasterxml.jackson.core.util.RequestPayload", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: {aba,b,c1234567890123456789012345678905.\n at [Source: UNKNOWN; line: 1, column: 1]\nRequest payload : a {getLocalizedMessage={aba,b,c123456789012345678901...#495#-1725556347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int", "java.lang.String"}, new String[]{"<sample:7>", "0", "65537", "Title"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0x0) as character #65538 of 4-char base64 unit: can only used between units: Title {getLocalizedMessage=Illegal white space char...#410#-1937915820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1087986702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"55297"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLastClearedToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("55297", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"65537"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLastClearedToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65537", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-65537"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLastClearedToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65537", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-65541"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLastClearedToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65541", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-65549"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLastClearedToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65549", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", "int,java.lang.String", "-2147483648", "-1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"56320", "t-1.5"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideStdFeatures", "int,int", "0", "55295"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenCharacterOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCodec", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"Hel\"o, World", "<s:ley>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<sample:0>", "65587"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", "java.lang.String", "sTITE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:4>", "a", "55295"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwInternal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"65536", "<null>", "<i:-1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", "java.io.OutputStream", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1087986702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleBase64MissingPadding", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#117695695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1517778132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1517778132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#547487125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-774419407", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-1744710414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "28160"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#609674868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "28160"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-360616139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "28160"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#470#371746584", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"a", "<null>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBooleanValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#466#-1927126282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#1957708862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "finishToken", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#117695695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1087986702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1087986702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1.5d", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}, 3), new String[][]{{"getOriginalMessage", "", "7"}, {"getProcessor", "", "1"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#-1994705891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-1231176120", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "releaseBuffered", "java.io.Writer", "<sample:1>"}}, 2), new String[][]{{"pathAsPointer", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<empty>", "0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:2>", "0"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:0>", "x1.5"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "close", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"PT1H", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: PT1H\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=PT1H\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=PT1H\n at [Source: UNKNOWN;...#374#1295483951", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"{aba,b,c1234567890123456789012345678905.", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "true", "55297"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}}), new String[][]{{"printStackTrace", "", "2"}, {"withRequestPayload", "com.fasterxml.jackson.core.util.RequestPayload", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: {aba,b,c1234567890123456789012345678905.\n at [Source: UNKNOWN; line: 1, column: 1]\nRequest payload : a {getLocalizedMessage={aba,b,c123456789012345678901...#495#-1725556347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<empty>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getObjectId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int", "java.lang.String"}, new String[]{"<sample:7>", "56320", "65537", "{aba,b,c1234567890123456789012345678905."}, false);
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal character '?' (code 0xdc00) in base64 content: {aba,b,c1234567890123456789012345678905. {getLocalizedMessage=Illegal character '?' (code 0xdc00) in base64 c...#387#-1638309975", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLongValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-65549"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-65549", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", "java.io.Writer", "<sample:1>"}}), new String[][]{{"getFormatFeatures", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", "java.io.Writer", "<sample:1>"}}), new String[][]{{"finishToken", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-432069874", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-432069874", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", "java.io.Writer", "<sample:1>"}}), new String[][]{{"finishToken", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-1402360881", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-1402360881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", "java.io.Writer", "<sample:1>"}}), new String[][]{{"finishToken", "", "5"}, {"feedInput", "byte[],int,int", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-1402360881", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#-1402360881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#463#-555303616", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#463#-1525594623", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", "java.lang.String,int,com.fasterxml.jackson.core.JsonToken", "123456789012345678901234567890", "-2147483648", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"56320", "i"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", "java.lang.String", ")"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"1.25", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideStdFeatures", "int,int", "2", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideStdFeatures", "int,int", "2", "4"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideStdFeatures", "int,int", "2", "4"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#2056764679", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"Hello, World", "<i:2>", "<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"Hello, World", "<i:2>", "<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<empty>", "65536"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"Title", "<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: Title\n at [Source: (Integer); line: 1, column: 1] {getLocalizedMessage=Title\n at [Source: (Integer); line: 1, column: 1], getMessage=Title\n at [Source: (...#384#-1076969892", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseIntValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:4>", "a", "55295"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_codec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", new String[]{"int", "int"}, new String[]{"10", "3"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "2"}}), new String[][]{{"hasPathSegment", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"true", "55295", "-2147483648", "-1"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideFormatFeatures", "int,int", "10", "65535"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", new String[]{"int", "int"}, new String[]{"65536", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getLongValue", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValueAs", "java.lang.Class", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "65535"}, true);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "-56320"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setCurrentValue", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-422803882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMore", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1393094889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<null>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#547487125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<null>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-422803882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "1.5e3001.1234567"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<null>", "2147483594"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1393094889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:0>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#2136453614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:1>", "65537", "-4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#1166162607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishTokenWithEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#117695695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1087986702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1393094889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-422803882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"a b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#1137166636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#470#891672295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#166875629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#-803415378", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#-1773706385", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenColumnNr", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"0.1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"0.096"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.096", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-5.304"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.304", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-10.608"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-10.608", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-5.303999999999999"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-5.303999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsDouble", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:5>", "2.12345673a!c"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:2>", "2.1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideCurrentName", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#117695695", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#117695695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#430930116", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#430930116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:3>", "65535", "28160"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"55295"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"2147483626"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", new String[]{"int"}, new String[]{"-536870912"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#1957708862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"{\"a\":1}", "-2147483648", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"z\"a\":1}", "-2147483648", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1517778132", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"z\"a\":1}", "2147483636", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"P", "-1073741869", "<sample:7>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"P", "-1073741869", "<sample:6>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"P", "3", "<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"P", "-1", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetFloat", "boolean,int,int,int", "true", "2147483647", "28160", "-1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "true", "65536"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"Q", "65534", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetFloat", "boolean,int,int,int", "true", "2147483647", "28160", "-1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "true", "65536"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", new String[]{"int", "java.lang.String"}, new String[]{"55297", "56320"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int", "65536", "2147483647"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "string value"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=55297, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#401#-1544747605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", new String[]{"int", "java.lang.String"}, new String[]{"55297", "55310"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int", "131072", "2147483647"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "string valuf"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=55297, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#401#-240353876", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", new String[]{"int", "java.lang.String"}, new String[]{"55297", "55310"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int", "131072", "2147483647"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "string valuf"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseIntValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=55297, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#402#-554442389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", new String[]{"int"}, new String[]{"-4"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-422803882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"{aba,b,c1234567890123456789012345678905.", "<sample:5>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "55295", "1e10"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#460#-460651098", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"auc\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "55295", "1e10"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#-1197568225", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#1094826303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#1094826303", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"ac"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#460#-164920289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{":`c"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#-2005380220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{":"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131073"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#459#407337575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{":1e10"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131072"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#463#262554772", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"D "}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131072"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#460#-1421145435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"WD "}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131072"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#-1259034226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131072"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#468#-1636388807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"xFFFFFFFF"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-55295", "1e1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131072"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#467#1380222313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTokenId", "int", "131072"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#482#-803847621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#17126848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#430930116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#-11373442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#-1994705891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidChar", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", new String[]{"int", "int"}, new String[]{"10", "28160"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<null>", "10", "3"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-304095753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"Hello, Wormd"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<null>", "10", "3"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-990913003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"Hello, Wormd"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<null>", "10", "3"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-1961204010", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"Hello, Wofmd"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<null>", "10", "3"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#1273035273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", "java.lang.String,int,com.fasterxml.jackson.core.JsonToken", "1L", "65537", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"{aba,b,c1234567890123456789012345678905."}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{aba,b,c1234567890123456789012345678905.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"{aba,b,c1234567890123456789012345678905.0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{aba,b,c1234567890123456789012345678905.0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"{aba,b,c123456790123456789012345678905.0x1Ftrue"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{aba,b,c123456790123456789012345678905.0x1Ftrue", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"{aba,b,c123456790123456789012345678905.0x1Ftrue-1.5"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{aba,b,c123456790123456789012345678905.0x1Ftrue-1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_wrapError", "java.lang.String,java.lang.Throwable", "5.", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueNonStdNumberComplete", "int", "56320"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueNonStdNumberComplete", "int", "56320"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueNonStdNumberComplete", "int", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.5d", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueNonStdNumberComplete", "int", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.5d", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueNonStdNumberComplete", "int", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.5d", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextValue", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#1957708862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextValue", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#987417855", SearchInputFactory_scaffolding.receiverState());
 }
}
