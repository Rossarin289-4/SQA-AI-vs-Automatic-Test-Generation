package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "0"}}), new String[][]{{"toFullString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-core/2.7.4-SNAPSHOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-43", "0"}, false), new String[][]{{"getEmbeddedObject", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "+1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}), new String[][]{{"getObjectId", "", "3"}, {"getText", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<empty>"}}), new String[][]{{"getValueAsBoolean", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#467#-1790672961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:0>"}}), new String[][]{{"nextBooleanValue", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}), new String[][]{{"nextBooleanValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", ""}}, 2), new String[][]{{"nextBooleanValue", "", "0"}, {"getValueAsString", "java.lang.String", "4"}, {"getTokenLocation", "", "4"}, {"getLineNr", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}, 3), new String[][]{{"getValueAsString", "", "5"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#467#-1790672961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}, 3), new String[][]{{"getCurrentToken", "", "5"}, {"hasTokenId", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#467#-1790672961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 2), new String[][]{{"hasTokenId", "int", "6"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "4"}, {"getValueAsLong", "long", "3"}, {"nextFieldName", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=START_O...#365#-972925255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}), new String[][]{{"hasTokenId", "int", "6"}, {"hasCurrentToken", "", "0"}, {"isExpectedStartObjectToken", "", "6"}, {"nextFieldName", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("END_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#464#1316788805", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:10>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#466#-1887348330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"30.0"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("30.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}}), new String[][]{{"getValueAsDouble", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParser$NumberType", actual.getClass().getName());
  assertEquals("INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=START_O...#365#-972925255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "0"}}, 1), new String[][]{{"toFullString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-core/2.7.4-SNAPSHOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.4-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=4, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-246608060", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "2147483647"}}, 3), new String[][]{{"getGroupId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "-Infinity"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "-Infinity"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"4.300000000000001"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.300000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1073741824", "134184968"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1073741824", "134184968"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}}, 3), new String[][]{{"getValueAsBoolean", "boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483645", "32"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-4611686018427387834"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686018427387834", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"9223372036854775783"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775783", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"9223372036854775764"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", "long", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"filterStartArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.JsonPointerBasedFilter", actual.getClass().getName());
  assertEquals("[JsonPointerFilter at: 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 2), new String[][]{{"filterStartArray", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "1.12345678"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 3), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "1.12344678"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 3), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "1.12344678"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 3), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 1), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 1), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 1), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "31"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 1), new String[][]{{"filterStartObject", "", "0"}, {"includeNumber", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-46.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-46.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:8>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:8>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:8>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#244774956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.4-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=4, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-246608060", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getMajorVersion", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"getMajorVersion", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.4-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=4, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-246608060", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 17, new String[][]{}), new String[][]{{"toFullString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-core/2.7.4-SNAPSHOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.4-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=4, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-246608060", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1929035831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-2048"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-2106"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2106", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"2"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"4098"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4098", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"8196"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("8196", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"8196"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", "java.lang.String", "http://example.com/a?b=c"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1464349211", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1464349211", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"includeEmbeddedValue", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1722601147", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-4.9E-324"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"4.9E-324"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"Infinity"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-Infinity"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1473464635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false), new String[][]{{"getColumnNr", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "9223372036854775807"}}), new String[][]{{"getCurrentLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#850363463", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "9223372036854775807"}}), new String[][]{{"getCurrentLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: <a><b>t</b></a>; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#850363463", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"2.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "Infinity"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "Infinity"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "Infinity"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"10", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "8388608"}, false, 14, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-44"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1797685485", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1797685485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-32812"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-216240940", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-216240940", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1527487094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-1", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"1024"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1024", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-43"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#950356094", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#950356094", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-32811"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#466#470334578", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#466#470334578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-32811"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:9>"}}), new String[][]{{"getLongValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:6>", "false"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}), new String[][]{{"filterStartArray", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1285883844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "31"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 1), new String[][]{{"filterStartObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.JsonPointerBasedFilter", actual.getClass().getName());
  assertEquals("[JsonPointerFilter at: 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "0x1234"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "5."}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"536870912"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870912", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"536870904"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870904", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"536870901"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870901", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"536870901"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870901", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-1929035831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", "int,int", "1", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "2"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-1623189998", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "2"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "2"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:5>", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:11>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1701325387", SearchInputFactory_scaffolding.receiverState());
 }
}
