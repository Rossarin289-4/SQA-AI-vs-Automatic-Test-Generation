package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#523333719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-1073741822"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"-134219801"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}}), new String[][]{{"getNumberType", "", "7"}, {"finishToken", "", "6"}, {"getText", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#358#1607619687", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#438#-1963800990", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-42"}}, 1), new String[][]{{"getTextLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#447#-1898800344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"1074001889"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-1073741919"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1074001889", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"-134219801", ""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 1), new String[][]{{"getCurrentValue", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-134217807"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-134217807", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<null>", "<empty>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}}, 1), new String[][]{{"getValueAsDouble", "", "2"}, {"getTextLength", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#464#1355438034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 2), new String[][]{{"getArtifactId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-databind", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}}, 2), new String[][]{{"getArtifactId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-databind", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", ";p", "<b:true>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-9223372036854775808"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", ":p3", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("END_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#446#-1437001594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "/a/b", "<sample:4>", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-02-011.12345678"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-011.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"202h0-02-011.12345678"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("202h0-02-011.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", " "}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", " "}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "000o"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "byte[],java.lang.String", "<null>", "5.TITLE"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "TITLE"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "10", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "2TITLE"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "10", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483136"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483161"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483161", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483161"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483161", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-1073741823"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "0x1F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"72"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Culrrti token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("72", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-268435444"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483604"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483604", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-47"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483623"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483623", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"536870903"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "-1"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("536870903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"12:30:45", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "i", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.OutputStream", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParser$NumberType", actual.getClass().getName());
  assertEquals("BIG_INTEGER", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-536903483"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-536903483", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-268435455"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-268435455", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"67108837"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("67108837", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483644"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483644", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#-1894254702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "010", "<null>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.7-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=f...#205#795210976", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#347#-930525440", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#347#-930525440", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"-1073741824"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#347#-174209324", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#347#-174209324", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"-1073741841"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#347#-1631856113", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#347#-1631856113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"-1073741841"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#451#-197020441", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#451#-197020441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"10"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#-2012429833", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#-2012429833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"4101"}, false, 11, new String[][]{}), new String[][]{{"getLastClearedToken", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#444#2074736918", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", new String[]{"int"}, new String[]{"4101"}, false, 11, new String[][]{}), new String[][]{{"getLastClearedToken", "", "1"}, {"getDecimalValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", "int", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "-1", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", "int", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "-1", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", ":p", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", ":p", "<b:true>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"a", "<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"0", "2020-01-01"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "0xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "0xFFFFFFFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String", "1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1", "-1"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#1369247036", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#1369247036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "10", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "10", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "10", "-0/0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "0", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", ""}}), new String[][]{{"getSchema", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<null>"}, false, 13, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code -2147483648)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", "java.lang.String", "-0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1073741824"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147482623"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147482623", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483612"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483612", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-11"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-22"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-22", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"131061"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("131061", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-01-01", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-02-011.12345678"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-011.12345678", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String", ":p"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"hasTokenId", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}}), new String[][]{{"getSchema", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", "int,java.lang.String", "10", "1.1234567"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", "int", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#755758717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#1236552694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1.5", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"10", "010"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:1>", "<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:4>", "<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", "int", "1"}}), new String[][]{{"getBigIntegerValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "10", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:10>"}, false, 8, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "2THTLE"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"010", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 010\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=010\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=010\n at [Source: UNKNOWN...#376#308237229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_EMBEDDED_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=true, getByteValue=!JsonParseException, getCurrentName=nu...#432#-479875119", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isFloa...#308#-1894254702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5e300", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-1073741823"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"I", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483646"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Current token ("}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2130706430"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:6>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Current token ("}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2130706430", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2130706485"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Current token ("}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2130706485", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Currt token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"4194294"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Currt token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194294", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"4194298"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Culrrt token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194298", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"4194426"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Culrrt token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4194426", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 9, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Culrrti token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "-52", "Culrrti token ("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1856278022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "abc", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<a>b</a>", "<sample:5>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"10", ":p"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2018"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2018", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-134219801"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-134219801", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "0", "-134219801"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483388"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483388", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#451#1941876120", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, World", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: a,b,c\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=a,b,c\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=a,b,c\n at [Source: U...#384#244521418", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "1", "abc"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-1880257702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-1880257702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", ""}}), new String[][]{{"getValueAsInt", "", "5"}, {"canParseAsync", "", "7"}, {"configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-2092250791", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-2092250791", SearchInputFactory_scaffolding.receiverState());
 }
}
