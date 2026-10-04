package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}), new String[][]{{"getCurrentLocation", "", "7"}, {"getColumnNr", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"../b"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}}, 2), new String[][]{{"getValueAsBoolean", "boolean", "1"}, {"getText", "", "6"}, {"getValueAsLong", "long", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "2147221480"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1788511988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<empty>"}}, 1), new String[][]{{"includeBoolean", "boolean", "7"}, {"includeRawValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}, 1), new String[][]{{"getLongValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", "long", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-241004789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"4"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getColumnNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "-9223372036854775808"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1219973003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"createChildArrayContext", "com.fasterxml.jackson.core.filter.TokenFilter,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY, isStartHandled=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "false"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"checkValue", "com.fasterxml.jackson.core.filter.TokenFilter", "5"}, {"filterFinishArray", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}, {"getMatchCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:5>", "false"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "2147483658"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "htt:/Wexample.com/a?b=c"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "TITKE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-642553526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"2147483584"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483584", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"46"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", "int,int", "-2147483647", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}}, 2), new String[][]{{"getNumberValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", "java.lang.String", "1m1234567890123456{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "-2147221503"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#829883066", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.4-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=4, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-246608060", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775754"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<null>"}}), new String[][]{{"isUnknownVersion", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "Titld"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"16384", "-2147483648"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "java.lang.Class", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"12:30;45"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"52"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-436118842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"0c"}, false, 7, new String[][]{}), new String[][]{{"getLocation", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"\ne"}, false), new String[][]{{"printStackTrace", "java.io.PrintStream", "3"}, {"getMessage", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ne\n at [Source: 2; line: 1, column: 1]", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: 2; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"TitFd"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}), new String[][]{{"printStackTrace", "java.io.PrintStream", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: TitFd\n at [Source: 2; line: 1, column: 1] {getLocalizedMessage=TitFd\n at [Source: 2; line: 1, column: 1], getMessage=TitFd\n at [Source: 2; line: 1, colum...#328#107034700", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}), new String[][]{{"includeNumber", "long", "4"}, {"includeNumber", "float", "5"}, {"filterStartArray", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", ""}}), new String[][]{{"getPatchLevel", "", "6"}, {"getMinorVersion", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-642553526", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-642553526", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getB...#529#-447041684", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"a,bc"}, false, 6, new String[][]{}), new String[][]{{"getLocation", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 1] {getByteOffset=0, getCharOffset=-1, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}}), new String[][]{{"includeNumber", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"-10"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"11", "1073741823"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-917471226", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-917471226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getColumnNr", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "8192"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}}), new String[][]{{"getMatchCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#464#907587128", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"-.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1788511988", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1788511988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDecimalValue", ""}}), new String[][]{{"getColumnNr", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}}), new String[][]{{"getNumberType", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTokenLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: key; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "1.123456790123456"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:7>", "<null>"}}), new String[][]{{"hasTokenId", "int", "6"}, {"hasCurrentToken", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#1701325387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"23"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"63"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("63", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "a,b-c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}), new String[][]{{"isClosed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:3>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "1.0000000000000002"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"25"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-27"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#463#-651173564", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "Hello,\037World-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "2146957311"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#1902993599", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "2147483647"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", "java.lang.Object", "<s:ac>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"-9223372028264841216"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372028264841216", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}}), new String[][]{{"getByteOffset", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:7>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", "double", "1.0000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getCurrentName", "", "6"}, {"getEntryCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}), new String[][]{{"includeEmbeddedValue", "java.lang.Object", "7"}, {"includeRawValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#-1788511988", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonParser$Feature", "3"}, {"getTextCharacters", "", "5"}, {"canReadObjectId", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#414843082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false), new String[][]{{"read", "char[]", "6"}, {"ready", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"-2097204"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-2097204", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xFFFFFFFF", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"setCurrentValue", "java.lang.Object", "0"}, {"nextTokenToRead", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-1073741824"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<sample:1>"}}), new String[][]{{"getTextOffset", "", "4"}, {"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#470#-2034939160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}), new String[][]{{"getCurrentName", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-2147221504"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#1103786089", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#471#1103786089", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", ""}}), new String[][]{{"getSourceRef", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}), new String[][]{{"getValueAsLong", "long", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#462#1769752357", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "true"}}), new String[][]{{"getDecimalValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"-2080374784"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"-52"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-52", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"null--11.5"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("null--11.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-598461", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, getCurre...#461#-1287080766", SearchInputFactory_scaffolding.receiverState());
 }
}
