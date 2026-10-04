package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"21474484648"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"TIULE1L"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "java.lang.Class", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.10.0-SNAPSHOT {getArtifactId=jackson-databind, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=10, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVersion...#207#-1250990500", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", "int,int", "-2147483648", "5"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParser$NumberType", actual.getClass().getName());
  assertEquals("BIG_INTEGER", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"2"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-1"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", ""}}), new String[][]{{"hasTokenId", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:7>", "<sample:1>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "17"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#461#-437365651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "15"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}}, 2), new String[][]{{"getTextCharacters", "", "7"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#447#-1898800344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_ARRAY", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"-2143289348"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-14"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#339#1722071286", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", "int", "-54"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"I0"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: I0\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=I0\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=I0\n at [Source: UNKNOWN; l...#372#-842089830", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"1.124567"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", " true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.124567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"14].", "<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 14].\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=14].\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=14].\n at [Source: UNKN...#380#985487141", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"0.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-16411", "-2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-54", "32770"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#445#2028698511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#445#2028698511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNonBlockingInputFeeder", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"a,b,c", "<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", "java.lang.String", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"FPT1H"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "10", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("FPT1H", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"0-1.5", "<sample:3>", "<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "abc"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"9223372036854774783"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854774783", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"122:30:45"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("122:30:45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"7\013"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("7\013", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "numrl"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "a-1", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"--1", "<sample:1>", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.OutputStream", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"<a>b</"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: <a>b</\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=<a>b</\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=<a>b</\n at [Source...#388#-462143344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"\n>", "<s:a>", "<d:-15.0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "-1048575"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "9223372036854775807"}}, 2), new String[][]{{"disable", "com.fasterxml.jackson.core.JsonParser$Feature", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#1236552694", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#1236552694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code -2147483648)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1.1234566890123456"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"a,c,c"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", "java.lang.String", "0x1\nF"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"aaaaaaaaaaa`aaaaaaaaaaaaaaaaaa.5", "<sample:5>", "<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"22"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "4097"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#444#861461362", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"40"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", "java.lang.String", "<x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "1F4.", "<sample:5>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1.123456788"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-108", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", ""}}, 3), new String[][]{{"asDouble", "double", "7"}, {"asDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-2"}}, 2);
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "50"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "-54", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"-32767"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-32767", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "I", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "12:330:45"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"5.1e170", "<s:>", "<i:0>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"1073741823", "\u00e9"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"1.]2345678901234567"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 1.]2345678901234567\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=1.]2345678901234567\n at [Source: UNKNOWN; line: -1, column: .., getM...#438#788201784", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"1.5", "<sample:8>", "<sample:8>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"5", "a,b,c/x1F"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1856278022", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#-1856278022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", "java.lang.String", ".5("}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"1", "-111"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object", "java.lang.Object"}, new String[]{"1", "<sample:1>", "<s:{>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"14."}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object", "a,b,c", "<i:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: 14.\n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=14.\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=14.\n at [Source: UNKNOWN...#376#-834328080", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", new String[]{"java.io.Writer"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false), new String[][]{{"getIntValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#338#467800161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"1e170"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#638571919", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"a/b"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a/b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"-1/52020-01-01", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setFeatureMask", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"-", "<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", ""}}), new String[][]{{"getSuppressed", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Ljava.lang.Throwable;", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code 10)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", "java.lang.String", "21474484648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: \n at [Source: UNKNOWN; line: -1, column: -1] {getLocalizedMessage=\n at [Source: UNKNOWN; line: -1, column: -1], getMessage=\n at [Source: UNKNOWN; line: -...#364#1908284877", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#215374655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCurrentValue", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", "int,java.lang.String", "0", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"0x12345678:"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object,java.lang.Object", "1.12345678", "<s:k(y>", "<d:5.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "01F", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"50", "0"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\013", "<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"2147448648"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"1474494648"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "0"}}), new String[][]{{"getRequestPayloadAsString", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"II"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("II", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", ""}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDoubleValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getDecimalValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"1.255"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 46, 50, 53, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentLocation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "12:30:45", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"--0.0"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "0x1234>6789", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("--0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{"double"}, new String[]{"8.98846567431158E307"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.98846567431158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInputCoercion", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken", "java.lang.Class"}, new String[]{"1e1701.5d", "<sample:1>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTextCharacters", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "557", "56"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483640", "20"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "-54", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "74"}, false), new String[][]{{"getFeatureMask", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasTokenId", new String[]{"int"}, new String[]{"32"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "true"}}), new String[][]{{"getValueAsDouble", "double", "7"}, {"getValueAsString", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#446#-835989420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"-B1", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLongValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}}), new String[][]{{"clearLocation", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core.JsonParseException: -B1 {getLocalizedMessage=-B1, getMessage=-B1, getOriginalMessage=-B1, getRequestPayloadAsString=null, getStackTrace=[com.fasterxml.jackson.core.base.Pars...#244#-1310950572", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-483612758", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-483612758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_constructError", "java.lang.String,java.lang.Throwable", "120", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#449#-1311219294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", "int", "2147483647"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#1236552694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{"java.lang.String"}, new String[]{"Current token (1.1345678901234567"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportUnexpectedNumberChar", new String[]{"int", "java.lang.String"}, new String[]{"1", "+2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "2147483648", "<sample:7>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "-9223372036854775808"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object,java.lang.Object", "\u00ea", "<s:>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isNaN", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideFormatFeatures", "int,int", "-108", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:62:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "1.12345678", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:62:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getInputSource", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "close", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"21475484648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21475484648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAsTree", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextLength", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BooleanNode", actual.getClass().getName());
  assertEquals("true {canConvertToInt=false, canConvertToLong=false, getNodeType=BOOLEAN, isArray=false, isBigDecimal=false, isBigInteger=false, isBinary=false, isBoolean=true, isContainerNode=false, isDouble=false, ...#308#-970602807", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFloatValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_NUMBER_INT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "0"}}), new String[][]{{"getColumnNr", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "13"}, false, 7, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#-628335558", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#442#-628335558", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"{\"a\";1}"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{\"a\";1}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"21474484648.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "\u00e90H"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("21474484648.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4611686018427387903", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", new String[]{"java.lang.String"}, new String[]{"abbc"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"-2147483648", "/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.Writer", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.io.JsonEOFException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", new String[]{"long"}, new String[]{"-9223371899415822336"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223371899415822336", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTokenLocation", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("[Source: UNKNOWN; line: -1, column: -1] {getByteOffset=-1, getCharOffset=-1, getColumnNr=-1, getLineNr=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readValueAs", "java.lang.Class", "<sample:5>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", "long", "-126"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "0"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"1e1"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1e1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-1582522888", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-1582522888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_getCharDesc", new String[]{"int"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\uffff' (code 2147483647 / 0x7fffffff)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "finishToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", ""}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"<a>b</a>6"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "4097"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"{3a\"1}"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[123, 51, 97, 34, 49, 125]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportError", "java.lang.String,java.lang.Object,java.lang.Object", "b,b,<", "<s:a>", "<d:-1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{"int"}, new String[]{"-5"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getByteValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1.6", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:4>", "<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "com.fasterxml.jackson.core.util.RequestPayload", "<sample:0>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_throwInternal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.TreeTraversingParser", actual.getClass().getName());
  assertEquals("{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:3>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "releaseBuffered", "java.io.OutputStream", "<sample:3>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "isExpectedStartObjectToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", new String[]{"int"}, new String[]{"2048"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2048", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_codec", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getShortValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_handleEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "readBinaryValue", "java.io.OutputStream", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", "byte[],java.lang.String", "<sample:1>", "\037"}}), new String[][]{{"getFeatureMask", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "17592186044415"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"J"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[74]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "0", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longIntegerDesc", new String[]{"java.lang.String"}, new String[]{"11.123456785."}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextIntValue", "int", "-10"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("11.123456785.", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "setRequestPayloadOnError", new String[]{"com.fasterxml.jackson.core.util.RequestPayload"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", "java.lang.String,com.fasterxml.jackson.core.JsonToken", "15.", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"1x123456789"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 120, 49, 50, 51, 52, 53, 54, 55, 56, 57]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentTokenId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", new String[]{"java.lang.String", "com.fasterxml.jackson.core.JsonToken"}, new String[]{"TITME1L", "<sample:8>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.exc.InputCoercionException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "2147483648", "<null>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#448#758295982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canParseAsync", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextLongValue", "long", "-4611686018427387904"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "clearCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=V...#349#1279256751", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowInt", "java.lang.String", "0"}}), new String[][]{{"findValues", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextCharacters", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "requiresCustomCodec", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[0, 127]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getBinaryValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "canReadTypeId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "nextToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#463#1398121977", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_longNumberDesc", new String[]{"java.lang.String"}, new String[]{"Hello, Wonrld1.1234567"}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportOverflowLong", ""}, {"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getValueAsString", "java.lang.String", "1123567"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Hello, Wonrld1.1234567", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=[0, 127], getBooleanValue=!JsonParseException, getByteValue=!JsonParseException...#445#-612231881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "currentNumericNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getText", "java.io.Writer", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.databind.node.BigIntegerNode", actual.getClass().getName());
  assertEquals("1 {canConvertToInt=true, canConvertToLong=true, getNodeType=NUMBER, isArray=false, isBigDecimal=false, isBigInteger=true, isBinary=false, isBoolean=false, isContainerNode=false, isDouble=false, isEmpt...#301#136108956", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#-107124906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getFeatureMask", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=!JsonParseException, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=!JsonParseException, ge...#441#408946158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "reportInvalidNumber", "java.lang.String", "a4aaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}), new String[][]{{"getValueAsDouble", "double", "6"}, {"getIntValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canParseAsync=false, canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=1, getBinaryValue=null, getBooleanValue=!JsonParseException, getByteValue=1, getCurrentName=null, getCurrentToken=n...#337#523333719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.databind.node.TreeTraversingParser", "com.fasterxml.jackson.databind.node.TreeTraversingParser", "getNumberType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.databind.node.TreeTraversingParser", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
}
