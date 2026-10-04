package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "needMoreInput", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberMinus", new String[]{"int"}, new String[]{"262401"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"-11"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberMinus", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNegativeNumber", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<sample:5>", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", new String[]{"boolean", "int"}, new String[]{"false", "56321"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "10"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "finishToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"na;e", "<sample:4>", "<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", "java.lang.String", ".5"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsLong", "long", "56320"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "true", "-56329"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", new String[]{"boolean", "int"}, new String[]{"true", "2"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reset", "boolean,int,int,int", "false", "-29", "112636", "28143"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-1188222675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNullToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideStdFeatures", "int,int", "65537", "112615"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", "boolean,int", "true", "65537"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-1271797607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"Titlff", "1", "<sample:9>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<null>", "-67164160"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "needMoreInput", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:4>", "65543", "38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-1188222675", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", new String[]{"int", "int"}, new String[]{"2", "-54"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:3>", "-16514865", "2"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int", "3", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdToken", new String[]{"int", "int"}, new String[]{"0", "55295"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberMinus", new String[]{"int"}, new String[]{"54"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "feedInput", "byte[],int,int", "<sample:3>", "-103426", "28160"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishTokenWithEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "-2147483648"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-48, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=-48, getCurrentName=null,...#375#905911520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishTokenWithEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=0, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=aaaaaaaaa...#390#902406746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:7>", "262401", "56379"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"null"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", "java.lang.String,int,com.fasterxml.jackson.core.JsonToken", "51.5", "4", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#473#-630592631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "-54"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startAposString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "56289"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[I", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishTokenWithEOF", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"1.12345678901234567", "<sample:7>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:10>", "-1073676289", "131200"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_checkStdFeatureChanges", "int,int", "10", "28160"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0xc000ffff) as character #131201 of 4-char base64 unit: can only used between units {getLocalizedMessage=Illegal white space cha...#411#-497680102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"IHello, World", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int", "<null>", "14080", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:0>", "1", "56321"}, false, 4, new String[][]{}, 3), new String[][]{{"getLocalizedMessage", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Illegal white space character (code 0x1) as character #56322 of 4-char base64 unit: can only used between units", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:8>", "-2147483648", "32768"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", new String[]{"int", "int"}, new String[]{"65535", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", new String[]{"int"}, new String[]{"56329"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#463#1184123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", new String[]{"int", "java.lang.String"}, new String[]{"56319", "--1"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBooleanValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=56319, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#401#-1745059752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#461#-646176444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"+2"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "symbolTableForTests", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#459#-1086307253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "char", "int"}, new String[]{"<sample:5>", "0", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "finishToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"1E-5", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", "java.lang.String,int,com.fasterxml.jackson.core.JsonToken", "null", "2147483647", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetAsNaN", "java.lang.String,double", "1.12345678901234567", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:7>", "56329", "33554436"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", new String[]{"int", "int"}, new String[]{"55296", "0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"0E1F"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", new String[]{"int", "int"}, new String[]{"28155", "2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "-2147483648", "39", "-56329"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "finishToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_addName", new String[]{"int[]", "int", "int"}, new String[]{"<null>", "33488895", "64"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#1014490863", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#1014490863", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNegativeNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentLocation", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", "java.lang.String,java.lang.Throwable", "true", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:10>", "true"}, false, 0, null, 3), new String[][]{{"getText", "", "6"}, {"getCurrentToken", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#458#-917059776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#547487125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"aab"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:0>", "56320", "2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", "PT1H"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#-1994705891", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#-1994705891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigDecimal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startAposString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseIntValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#547487125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-2080374784", "60416"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-217931668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startArrayScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#462#800171894", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextChar", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#463#-969106884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<sample:0>", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"finishCurrentSegment", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startAposString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"39", "\037"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", "java.lang.String", "5L"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"Tiule", "<sample:2>"}, false, 1, new String[][]{}, 1), new String[][]{{"getLocalizedMessage", "", "7"}, {"getCause", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Throwable", actual.getClass().getName());
  assertEquals("java.lang.Throwable: java.lang.Throwable:  {getLocalizedMessage=java.lang.Throwable: , getMessage=java.lang.Throwable: , getStackTrace=[java.base/jdk.internal.reflect.NativeConstructorAccessorImp.., g...#216#1077319142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", new String[]{"int", "int"}, new String[]{"-39", "28143"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", "int", "28191"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenLineNr", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_nonStdToken", "int", "-1074200583"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToLong", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_closeArrayScope", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_codec", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"2010-01-01"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_codec", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "needMoreInput", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidInitial", "int", "-2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:13>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "202c0-01-01\n", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", "java.lang.String", "e"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1234567890123456789012345678900x123456789"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1234567890123456789012345678900x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"[1-2]"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[91, 49, 45, 50, 93]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:5>", "-65537", "2147483647"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_addName", new String[]{"int[]", "int", "int"}, new String[]{"<sample:3>", "27", "55296"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsString", "java.lang.String", ".5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberMinus", new String[]{"int"}, new String[]{"39"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"30"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "123456789012345678901234566890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "27648", "65537", "56324"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnexpectedChar", "int,java.lang.String", "33620004", "x1123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_codec", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_closeInput", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFloatValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", new String[]{"char[]", "int"}, new String[]{"<sample:1>", "2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"1073741847"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741847", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"65607"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", "java.lang.String", "Tfalse"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", "java.lang.String,java.lang.Object,java.lang.Object", "", "<s:key>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("65607", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"1Lhttp//example.com/a?b=c", "<sample:3>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseNumericValue", new String[]{"int"}, new String[]{"56321"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", "java.lang.String,int,com.fasterxml.jackson.core.JsonToken", "20\t20-02-30T25:61:51", "-27648", "<sample:8>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextChar", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordToken", "java.lang.String,int,com.fasterxml.jackson.core.JsonToken", "2020-01-011.12345678901234567", "1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", "int", "-27644"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextTextValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", new String[]{"int", "int", "int", "int"}, new String[]{"131074", "2147483647", "-60415", "56337"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "skipChildren", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", new String[]{"int", "java.lang.String"}, new String[]{"32767", "a,,c"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=32767, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#401#1679911098", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-65475", "55351"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportMissingRootWS", "int", "32768"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#1957708862", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#456#1957708862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "growArrayBy", new String[]{"int[]", "int"}, new String[]{"<null>", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NegativeArraySizeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"1.5e30", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatExponent", new String[]{"boolean", "int"}, new String[]{"true", "28160"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidNumber", "java.lang.String", "2020-02-30T25:6161"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseIntValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", "java.lang.String", "b526"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"19"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigDecimal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:5>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToInt", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1393094889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:8>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", "com.fasterxml.jackson.core.Base64Variant,int,int,java.lang.String", "<sample:4>", "2147483647", "55296", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", "int,int", "-1073741820", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int,int,int", "-458751", "-27648", "1", "1073852416"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_padLastQuad", new String[]{"int", "int"}, new String[]{"2147483647", "524746"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"1L12:30:45"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1L12:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"-39"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-39", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reset", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "2147483647", "131074", "-27648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportTooLongIntegral", "int,java.lang.String", "2147483647", "2020-02-30T25:616/"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "skipChildren", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", new String[]{"int", "int", "int"}, new String[]{"524802", "-17", "-2147481600"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", new String[]{"int", "int"}, new String[]{"10", "1073741823"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", "java.lang.String", "!\u00e9"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_addName", "int[],int,int", "<null>", "-27648", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextBooleanValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", new String[]{"char[]", "int"}, new String[]{"<sample:2>", "56321"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenColumnNr", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleBase64MissingPadding", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNumberValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetInt", new String[]{"boolean", "int"}, new String[]{"false", "112664"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"0x1234567891.5d"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_findName", "int,int", "2147483647", "56319"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"65436"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65436", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", "java.lang.String", "TITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getText2", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_longIntegerDesc", "java.lang.String", ",-1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getIntValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int"}, new String[]{"<sample:4>", "2147483583", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNullToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFloatValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "4", "-2147483648", "56533"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", new String[]{"int"}, new String[]{"55349"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getSchema", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=fal...#203#1823395988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorTokenWithEOF", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_checkStdFeatureChanges", "int,int", "2", "-16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getSourceReference", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_padLastQuad", new String[]{"int", "int"}, new String[]{"-134152191", "56329"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-255", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getCharDesc", new String[]{"int"}, new String[]{"65600"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'@' (code 65600 / 0x10040)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextLongValue", new String[]{"long"}, new String[]{"33554370"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("33554370", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideFormatFeatures", "int,int", "-2147483648", "56319"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:3>", ">.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:4>", "-1", "28160"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-217931668", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", "int", "524290"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_padLastQuad", new String[]{"int", "int"}, new String[]{"2", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16777214", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetFloat", new String[]{"boolean", "int", "int", "int"}, new String[]{"false", "-10", "-2147483648", "2147483600"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:6>", "1", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenLineNr", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"g1E-6", "<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwInvalidSpace", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: g1E-6\n at [Source: (Integer); line: 1, column: 1] {getLocalizedMessage=g1E-6\n at [Source: (Integer); line: 1, column: 1], getMessage=g1E-6\n at [Source: (...#384#-646849340", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"PPT1H"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#462#-1826861998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"release", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0, size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidInitial", new String[]{"int"}, new String[]{"7929856"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", "java.lang.String", ">.4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueComplete", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", "char[],int,int", "<sample:5>", "55296", "131074"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NULL", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#462#-151495209", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"-134152188", "a cfalse"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getInputSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", new String[]{"int", "int"}, new String[]{"-2147483648", "-27614"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "", "<sample:1>", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "finishToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"5632"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "true", "55356"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFormatFeatures", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdToken", new String[]{"int", "int"}, new String[]{"-55296", "-28164"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideCurrentName", "java.lang.String", "--1"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_closeInput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1", "<sample:6>", "<sample:5>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenCharacterOffset", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", "int,java.lang.String", "-2147483648", "-1.5-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=-2147483648, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExcepti...#432#1355701534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getNumberType", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "0x123456789", "<sample:4>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_padLastQuad", new String[]{"int", "int"}, new String[]{"55297", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16721919", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "loadMoreGuaranteed", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"falsf"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenColumnNr", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", "java.lang.String", "5.string value"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getParsingContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFieldWithEscape", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", ""}}), new String[][]{{"setCurrentValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonReadContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_updateTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,char,int", "<sample:2>", "3", "-16252414"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startPositiveNumber", new String[]{"int"}, new String[]{"131070"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", "java.lang.String,java.lang.Object", "12:30:452020-01-01", "<b:true>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "overrideCurrentName", "java.lang.String", "1.25-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canParseAsync", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startString", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportTooLongIntegral", new String[]{"int", "java.lang.String"}, new String[]{"-1", "11.5e3000x123456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeBase64Escape", "com.fasterxml.jackson.core.Base64Variant,int,int", "<sample:4>", "2", "65537"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#474#-1343895869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseIntValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportInvalidBase64Char", new String[]{"com.fasterxml.jackson.core.Base64Variant", "int", "int", "java.lang.String"}, new String[]{"<sample:9>", "-4194315", "2147483647", "v"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getEmbeddedObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.IllegalArgumentException", actual.getClass().getName());
  assertEquals("java.lang.IllegalArgumentException: Illegal white space character (code 0xffbffff5) as character #-2147483648 of 4-char base64 unit: can only used between units: v {getLocalizedMessage=Illegal white s...#419#1951944824", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getDoubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 1, new String[][]{}), new String[][]{{"withRequestPayload", "com.fasterxml.jackson.core.util.RequestPayload", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 2020-01-01\n at [Source: UNKNOWN; line: 1, column: 1]\nRequest payload : sample {getLocalizedMessage=2020-01-01\n at [Source: UNKNOWN; line: 1, column: 1]\nR...#445#1727316532", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidOther", new String[]{"int", "int"}, new String[]{"33792", "2147483633"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"64"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", "java.io.OutputStream", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_eofAsNextToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetInt", new String[]{"boolean", "int"}, new String[]{"false", "262401"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#464#-1824399349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportError", "java.lang.String,java.lang.Object,java.lang.Object", "", "<s:eXy>", "<s:b>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{"+1C"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingNegZeroes", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#460#-1922570079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "1e102020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getByteArrayBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"nale"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#674183434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "endOfInput", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberLeadingZeroes", ""}}), new String[][]{{"initCause", "java.lang.Throwable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"4", ",-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "\037", "<null>", "<sample:4>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startUnexpectedValue", "boolean,int", "false", "35"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getValueAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToBigInteger", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishErrorToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFalseToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwUnquotedSpace", "int,java.lang.String", "-32769", "1234567-89012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#133683857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNullToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#1103974864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "canReadTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNegativeNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishFloatFraction", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-836607150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNegativeNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentToken", ""}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startNumberLeadingZero", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reset", "boolean,int,int,int", "true", "536870913", "56320", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", actual.getClass().getName());
  assertEquals("{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startArrayScope", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueCompleteInt", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaastring valuea"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=2147483647, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseExceptio...#427#-1944233409", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "resetInt", new String[]{"boolean", "int"}, new String[]{"false", "-28158"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"i"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_addName", "int[],int,int", "<sample:1>", "11", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1680201848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdTokenWithEOF", "int,int", "262148", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#463#1184123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_fieldComplete", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_decodeEscaped", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("FIELD_NAME", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#457#1295276068", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startFloat", new String[]{"char[]", "int", "int"}, new String[]{"<sample:6>", "-65535", "28672"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "clearCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_FLOAT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#469#-1744710414", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getTokenColumnNr", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextIntValue", new String[]{"int"}, new String[]{"225284"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_handleUnrecognizedCharacterEscape", "char", ")"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("225284", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"112638", ""}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startTrueToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNonStdToken", "int,int", "2147483633", "-27648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#-1806898157", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}, {"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-1266398580", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"--110x1F"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_closeObjectScope", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "convertNumberToDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#2058277709", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_reportInvalidEOF", "java.lang.String", "552:6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#1644474441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_valueNonStdNumberComplete", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_startObjectScope", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishKeywordTokenWithEOF", new String[]{"java.lang.String", "int", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"-0.0-1", "56272", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_parseNumericValue", "int", "-2058"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-709910841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_getSourceReference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "_finishNumberIntegralPart", "char[],int", "<sample:5>", "56369"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#465#2074265871", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "getShortValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "nextFieldName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "com.fasterxml.jackson.core.json.async.NonBlockingJsonParser", "currentTokenId", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=true, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPars...#455#-296107573", SearchInputFactory_scaffolding.receiverState());
 }
}
