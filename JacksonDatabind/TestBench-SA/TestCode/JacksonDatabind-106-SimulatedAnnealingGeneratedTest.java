package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-9223372036854775808"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1073741882", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", "`!b"}}, 2), new String[][]{{"getFeatureMask", "", "7"}, {"close", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#451#1941876120", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#451#1941876120", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}}, 3), new String[][]{{"getValueAsLong", "", "2"}, {"getText", "java.io.Writer", "1"}, {"getLastClearedToken", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1073741824", "2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:2>", "<sample:0>"}}), new String[][]{{"getTextCharacters", "", "3"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#457#208908441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-524391"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-524391", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"1", "+C11"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "a,b,c", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 49, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}}, 3), new String[][]{{"pathAsPointer", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"--1", "<sample:11>", "<sample:5>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"--1", "<sample:12>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"--1", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{" ", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"-00", "<sample:5>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String", "+2"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", "java.lang.String", "a,b,c"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "10", "\u00e9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775744"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "TITLE", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-175921860444126"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String", "1.5f"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isEmpt...#301#136108956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, null, 2), new String[][]{{"clearLocation", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: /a/b {getLocalizedMessage=/a/b, getMessage=/a/b, getOriginalMessage=/a/b, getRequestPayloadAsString=null, getStackTrace=[com.fasterxml.jackson.core.JsonP...#248#1236145215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}}, 2), new String[][]{{"clearLocation", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: /a/b {getLocalizedMessage=/a/b, getMessage=/a/b, getOriginalMessage=/a/b, getRequestPayloadAsString=null, getStackTrace=[com.fasterxml.jackson.core.JsonP...#248#1236145215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"0", "<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 0\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=0\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=0\n at [Source: UNKNOWN; line...#368#269963723", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "1073741823"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", ""}}, 2), new String[][]{{"isSnapshot", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:5>", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}}, 3), new String[][]{{"getNumberType", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "+1", "<sample:3>"}}, 1), new String[][]{{"getNumberType", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "java.lang.String", "0x123556789"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-6917529027641081856"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-6917529027641081856", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"72"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"2305843009213693890"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2305843009213693890", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"1048575"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1048575", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"156"}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1-1333567", "<sample:4>", "<sample:7>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("156", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775800"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775800", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "Current token (", "<sample:1>", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"180"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("180", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-137438953472"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-137438953472", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-274877906944"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-274877906944", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"3120564026"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "1e10", "<sample:2>", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3120564026", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-1853358546"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInputCoercion", "java.lang.String,com.fasterxml.jackson.core.JsonToken,java.lang.Class", "0e10{\"a\":1}", "<sample:5>", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1853358546", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", ".5", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "10", "a,b,c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-17"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-17"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "16418"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "16418"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-16480"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#433#-414408775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-16480"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#1874510163", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-16480"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#-1182286032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"byte[]", "java.lang.String"}, new String[]{"<empty>", "0x1F"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:2>", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-32960"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-66071851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-32960"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#-542460037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-32960"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-32960"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"+1", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParser$NumberType", actual.getClass().getName());
  assertEquals("BIG_INTEGER", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"a"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"--1", "<sample:5>", "<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"--1", "<sample:3>", "<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", "java.lang.String", "Hello, World"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", "java.lang.String", "Hello,\037World"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "10", "\u00e9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "2147483647", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object,java.lang.Object", "I", "<s:a>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"a,b,chttp://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,chttp://example.com/a?b=c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"a,b,cittp://example.com/5a?b="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cittp://example.com/5a?b=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"a,b,cittp://eexample.com/5a?b="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,cittp://eexample.com/5a?b=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"a,b,bittp://eexample.com/5a?b="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a,b,bittp://eexample.com/5a?b=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"`,b,bittp://eexample.com/5a?b="}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,b,bittp://eexample.com/5a?b=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"`,b,bittp://eexample.cm/5a?b="}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`,b,bittp://eexample.cm/5a?b=", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code 1)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"-16"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\ufff0' (code -16)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"0xFFFFFFFF", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "[1,2]", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"1.5f", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:4>", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: Title\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=Title\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=Title\n at [Source: U...#384#-1174522314", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#467800161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"B2.{\"a\"911"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "0", "/a/b"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:4>", "true"}}), new String[][]{{"getSuppressed", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#467800161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"B2.{\"a\"\"911"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "0", "/a/b"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: B2.{\"a\"\"911\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=B2.{\"a\"\"911\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=B2.{\"a\"\"...#408#1563390540", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "0", "/a/b"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}}), new String[][]{{"clearLocation", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: /a/b {getLocalizedMessage=/a/b, getMessage=/a/b, getOriginalMessage=/a/b, getRequestPayloadAsString=null, getStackTrace=[com.fasterxml.jackson.core.JsonP...#248#1236145215", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#641576798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "0", "PT1H"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "1", "1"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", ""}}), new String[][]{{"isSnapshot", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"3020-01-01"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<null>", "<empty>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"2147483647"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}}), new String[][]{{"toFullString", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core/jackson-databind/2.10.0-SNAPSHOT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}}), new String[][]{{"getNumberType", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}}), new String[][]{{"getNumberType", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1856278022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#446#1033341869", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#446#-835989420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#755758717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "1.5d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"-9223372036846387200"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036846387200", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"3"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-3"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"13"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-63"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775797"}, false, 14, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-63"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775797", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-4611686078556930149"}, false, 11, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-4611686078556930149", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "PT1H", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-1"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"1"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1.1234567", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"96"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1.1234567", "<sample:7>", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "", "<sample:2>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223372036854775693"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1-123456B7", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775693", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\t", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "[1,2]", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", "[1,2]"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#346#1778848360", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#346#1778848360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:1>", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#1153792344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-528482816"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-528482816", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1--1234f6678a"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "Hello, World", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#450#-52854298", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1--1234f66678a"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "Hello, World", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#451#-1365806268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "Hello, World", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#437#-212514841", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1--123466678a"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "Hello, World", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#450#-354442218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "1056964608"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "1056964608"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"i"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"a"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\uffff' (code -1)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "0e10{\"a\":1}"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "a,b,c", "<s:b>"}}), new String[][]{{"getBooleanValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1856278022", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1856278022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.OutputStream", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("i", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", "java.lang.String", "-1.5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
