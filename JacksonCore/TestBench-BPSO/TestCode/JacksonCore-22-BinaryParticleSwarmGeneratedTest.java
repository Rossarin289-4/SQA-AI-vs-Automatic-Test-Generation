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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", "java.lang.String", "+11"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false), new String[][]{{"getValueAsBoolean", "boolean", "7"}, {"getValueAsDouble", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"getTextOffset", "", "6"}, {"getParsingContext", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false), new String[][]{{"getValueAsLong", "", "4"}, {"getValueAsBoolean", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "35"}}), new String[][]{{"getTokenLocation", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}}, 2), new String[][]{{"includeString", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "-1"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", "java.lang.String", "08"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "-2"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"c"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"-34359738367"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#1980885704", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<empty>", "123456789012\u00e9345678901234567890"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "byte[],java.lang.String", "<null>", "010"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}}, 1), new String[][]{{"toFullString", "", "7"}, {"isSnapshot", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}}, 2), new String[][]{{"hasTextCharacters", "", "7"}, {"getTokenLocation", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-607920123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#1980885704", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"-8"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"getNumberValue", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1", "57"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1199081258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1199081258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=cnull"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://example.com/a?b=cnull", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{}, 1), new String[][]{{"getNumberValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"-45"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "-94"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", "int,int", "4095", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"6"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"Titme"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}, 1), new String[][]{{"inObject", "", "5"}, {"hasCurrentIndex", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "62"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", ""}}, 1), new String[][]{{"getBinaryValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<empty>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "-8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", ""}}), new String[][]{{"hasToken", "com.fasterxml.jackson.core.JsonToken", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#-2045818598", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"26"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:0>", "5.2i47483648"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"Hello, Wolld"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "byte[],java.lang.String", "<sample:0>", "-5f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getColumnNr", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"trud\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: trud\u00e9\n at [Source: UNKNOWN; line: 1, column: 1] {getLocalizedMessage=trud\u00e9\n at [Source: UNKNOWN; line: 1, column: 1], getMessage=trud\u00e9\n at [Source: UNKNO...#378#1158106342", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canParseAsync", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:2>"}}), new String[][]{{"getLongValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "268435457"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"`"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1307907044", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1307907044", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", "int,int", "-45", "-47"}}), new String[][]{{"getMatchCount", "", "1"}, {"getValueAsInt", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#1658585016", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "false"}}), new String[][]{{"getRequestPayload", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:8>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", new String[]{}, new String[]{}, false), new String[][]{{"getLineNr", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"pathAsPointer", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:2>", "true"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false), new String[][]{{"getPatchLevel", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"\u00e9\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getByteValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false), new String[][]{{"isUnknownVersion", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", ""}}), new String[][]{{"getBooleanValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:9>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-833909212", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-833909212", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false), new String[][]{{"getFilter", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}}), new String[][]{{"currentTokenId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", "int,int", "2147483647", "-25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false), new String[][]{{"getTypeId", "", "2"}, {"getValueAsInt", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#1980885704", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-134217773", "1"}, false), new String[][]{{"getParsingContext", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "104"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-993223101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}}), new String[][]{{"isClosed", "", "7"}, {"getTokenLocation", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 1] {getByteOffset=-1, getCharOffset=0, getColumnNr=1, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", ""}}), new String[][]{{"getValueAsDouble", "double", "4"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#-561424245", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#-561424245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-253496708", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<sample:0>", "\n1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canParseAsync", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", new String[]{"int"}, new String[]{"47"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-47", "-38"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#1130597567", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#1130597567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", ""}}), new String[][]{{"getTextCharacters", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#1286749952", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"currentTokenId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNonBlockingInputFeeder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getFilter", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", new String[]{"java.lang.String"}, new String[]{" "}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException:  \n at [Source: (byte[])\"\ufffd\"; line: 1, column: 1] {getLocalizedMessage= \n at [Source: (byte[])\"\ufffd\"; line: 1, column: 1], getMessage= \n at [Source: (byte[])\"...#374#-341369628", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.JsonPointerBasedFilter", actual.getClass().getName());
  assertEquals("[JsonPointerFilter at: 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "45"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-1141053879", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-1141053879", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canParseAsync", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canParseAsync", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:5>"}}), new String[][]{{"isSnapshot", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}}), new String[][]{{"getBigIntegerValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}), new String[][]{{"hasTokenId", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1784069287", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<empty>", "-=1.5"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false), new String[][]{{"getParsingContext", "", "3"}, {"checkValue", "com.fasterxml.jackson.core.filter.TokenFilter", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "5"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-7"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1313082418", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1313082418", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false), new String[][]{{"getTypeId", "", "4"}, {"getEmbeddedObject", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"0x12345678:"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x12345678:", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"http://exam0le.com/a?b=c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("http://exam0le.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-47", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<sample:1>"}}), new String[][]{{"getValueAsDouble", "double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getIntValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"1-12345678"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#-661724323", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#-661724323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"-2"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "java.lang.Class", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"skipParentChecks", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNonBlockingInputFeeder", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}}), new String[][]{{"hasTextCharacters", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getInputSource", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", ""}}), new String[][]{{"getGroupId", "", "4"}, {"getMinorVersion", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "-23"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-47"}}), new String[][]{{"getCurrentIndex", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#2100888574", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:11>"}}), new String[][]{{"getCurrentValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"8,0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", new String[]{"long"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:0>", "<empty>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
