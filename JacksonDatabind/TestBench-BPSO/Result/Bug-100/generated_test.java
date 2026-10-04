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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-1073741830"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParser$NumberType", actual.getClass().getName());
  assertEquals("BIG_INTEGER", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"11.12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-1073741810"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#447#-1898800344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", ""}}), new String[][]{{"hasTextCharacters", "", "4"}, {"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#447#-1898800344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", ""}}, 2), new String[][]{{"getSchema", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"-2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:8>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.Writer", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"1", "2147479551"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-9223372036854775801"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "2.5d"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "true"}}, 1), new String[][]{{"getMajorVersion", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#339#-860281059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", ""}}, 2), new String[][]{{"getFeatureMask", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "1.5ee\r300/a/b", "<s:>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#-1894254702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getObjectId", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"1", ""}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"getBigIntegerValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"asInt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleUnrecognizedCharacterEscape", "char", " "}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "[", "<sample:3>", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"-2147483648", "2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "1", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"a b1E-5", "<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "-2147483648", "-11.5d"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "+\u00e9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"-1073741760", "n>ll"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "`bc"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"1"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{" "}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#438#910623289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "java.lang.String", "-1"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "1ee10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"PHello, Worle", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "2097153"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#641576798", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#641576798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "-1073741824", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1073741823"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"0xFFFFF]FFF", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "20", "-2145386496"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"21.5e300"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "7", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "2147483647", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#-1894254702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "1036"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1.5e\r300/a/b"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"-2147483648", ""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "-2147483648", "1.5e300"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"+010"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("+010", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1620305253", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "16d", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"L", "<null>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: L\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=L\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=L\n at [Source: UNKNOWN; line...#368#384623891", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"-"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", "int", "-1073741824"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"1/5f "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 47, 53, 102, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}}), new String[][]{{"getArtifactId", "", "6"}, {"toFullString", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-databind/2.9.7-SNAPSHOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", ""}}), new String[][]{{"getCurrentLocation", "", "5"}, {"getLineNr", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#641576798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "14"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "-00"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"null"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:0>", "<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.Writer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"<a>b</a>1", "<sample:3>"}, false), new String[][]{{"fillInStackTrace", "", "4"}, {"getOriginalMessage", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"+1", "<sample:1>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("END_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"-1", "a "}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "1", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false), new String[][]{{"getBooleanValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "java.lang.Class", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"iterator", "", "1"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#346#1778848360", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#346#1778848360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"47"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "123456789012345678901234577890"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false), new String[][]{{"booleanValue", "", "6"}, {"findValuesAsText", "java.lang.String,java.util.List", "6"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", ""}}), new String[][]{{"canParseAsync", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"-1073741841", "x-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}), new String[][]{{"getCurrentToken", "", "5"}, {"getCurrentName", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"1e1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 101, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"Tit"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Tit", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"\t", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#523333719", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#523333719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-01-011.1234567"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-011.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:5>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.OutputStream", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"isClosed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: \n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=\n at [Source: UNKNOWN; line: -...#364#73779400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "java.lang.String", "http://:xample.com/a?b=cTITLE"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.5", "<i:2>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"1E-5.5"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 69, 45, 53, 46, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#467800161", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#467800161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "e10", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<a>b</a>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1n.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", "java.lang.Object", "<s:kex>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "java.lang.Class", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false), new String[][]{{"getCurrentValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}), new String[][]{{"has", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"4"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[52]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#523333719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"abc"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[97, 98, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#641576798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "-2147483648", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "byte[],java.lang.String", "<sample:0>", "2.6d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-24"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#443#-1894070419", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", "java.lang.Object", "<s:be>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-536870912"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"h1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("h1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "2147483647"}}), new String[][]{{"getByteValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-536870913"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#346#-1784055183", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleUnrecognizedCharacterEscape", "char", "<"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}}), new String[][]{{"getCurrentLocation", "", "0"}, {"getColumnNr", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "2020p-01-01"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "-9223372036854775808"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BinaryNode", actual.getClass().getName());
  assertEquals("\"AH8=\" {canConvertToInt=false, canConvertToLong=false, getNodeType=BINARY, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=true, isBoolean=false, isContainerNode=false, isDouble=false,...#316#-1946860506", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"{\"a\":1}", "<sample:4>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"Hello, Word"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 100]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#339#-799763214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1620305253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1620305253", SearchInputFactory_scaffolding.receiverState());
 }
}
