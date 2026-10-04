package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", ""}}), new String[][]{{"getMinorVersion", "", "4"}, {"getArtifactId", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsInt", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:6>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Integer)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCodec", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "0"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1025693753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", "com.fasterxml.jackson.core.filter.TokenFilterContext", "<sample:10>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextToken2", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextCharacters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:10>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#469#1734382419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#469#1734382419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}, {"getTypeId", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}, {"getTypeId", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-199263162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}, {"getTypeId", "", "1"}, {"getValueAsLong", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-199263162", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-199263162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-653832062", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1812569577", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#1812569577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "-10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}}, 2), new String[][]{{"getTextCharacters", "", "6"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-1594840548", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#458#-1594840548", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8193", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: (byte[])\"\ufffd\"; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: (ByteArrayInputStream); line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"sourceDescription", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(ByteArrayInputStream)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNKNOWN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(StringReader)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", "int", "10"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFloatValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "-15"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextLongValue", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:0>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8193", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "java.lang.String", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canReadObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.0-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#1980885704", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false), new String[][]{{"getMinorVersion", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getMinorVersion", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getMinorVersion", "", "4"}, {"getArtifactId", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "version", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#469#1734382419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_nextTokenWithBuffering", new String[]{"com.fasterxml.jackson.core.filter.TokenFilterContext"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentToken", ""}}), new String[][]{{"getEmbeddedObject", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1025693753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#469#1734382419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTokenId", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isNaN", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", "long", "9223372036854775807"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getShortValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_constructError", "java.lang.String", "1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "finishToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-240028794", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: (byte[])\"\ufffd\"; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("UNKNOWN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 11, new String[][]{}), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(String)\"<a><b>t</b></a>\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(byte[])\"\ufffd\"", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:1>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLastClearedToken", ""}}), new String[][]{{"sourceDescription", "", "3"}, {"getCharOffset", "", "0"}, {"sourceDescription", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(ByteArrayInputStream)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNumberType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#465#-1200361676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNonBlockingInputFeeder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getText", "java.io.Writer", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:5>", "<null>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartArrayToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "2020-01-01"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "currentToken", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("NOT_AVAILABLE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#466#-1025693753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "hasCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBigIntegerValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.Writer", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsBoolean", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: (byte[])\"\ufffd\"; line: 1, column: 0] {getByteOffset=-1, getCharOffset=-1, getColumnNr=0, getLineNr=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getParsingContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "close", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTokenLocation", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-1067635330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentTokenId", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "isExpectedStartObjectToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getTextLength", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "requiresCustomCodec", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "java.lang.Class", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getMatchCount", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#456#-2037926337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getLongValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringParserDelegate", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#457#-541815705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_codec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsString", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "skipChildren", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValuesAs", "java.lang.Class", "<sample:0>"}}), new String[][]{{"getNumberType", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canParseAsync", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextIntValue", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getDoubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readBinaryValue", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "releaseBuffered", "java.io.OutputStream", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getFilter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=!JsonPar...#459#1278857691", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "nextBooleanValue", new String[]{}, new String[]{}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getValueAsLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getBooleanValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}, {"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "readValueAsTree", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.filter.FilteringParserDelegate", "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_filterContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.filter.FilteringParserDelegate", "getCurrentValue", ""}}, 1), new String[][]{{"writePath", "com.fasterxml.jackson.core.JsonGenerator", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=!NullPointerException, canReadTypeId=!NullPointerException, getBigIntegerValue=!NullPointerException, getBinaryValue=!NullPointerException, getBooleanValue=!NullP...#524#-957978072", SearchInputFactory_scaffolding.receiverState());
 }
}
