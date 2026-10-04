package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{" (from ["}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "-8"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", "int,int", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "0x1F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", "int,int", "10", "10"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", "java.lang.Class", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-325559896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=[], getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=VALUE_STRING, getCurrent...#352#1444669026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"\t"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "java.lang.Class", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "P2EH"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#389#404486544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", "java.lang.String", "i"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "I"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=I, getCurrentToken=null, g...#361#291732400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-9", "14"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", ""}}, 3), new String[][]{{"hasCurrentToken", "", "7"}, {"disable", "com.fasterxml.jackson.core.JsonParser$Feature", "7"}, {"getEmbeddedObject", "", "7"}, {"getValueAsDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1544125819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 1), new String[][]{{"isUknownVersion", "", "4"}, {"compareTo", "com.fasterxml.jackson.core.Version", "1"}, {"isUknownVersion", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}}, 3), new String[][]{{"getGroupId", "", "3"}, {"getArtifactId", "", "3"}, {"isUknownVersion", "", "3"}, {"compareTo", "com.fasterxml.jackson.core.Version", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=a, getCurrentToken=FIELD_N...#367#1340956332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}}, 3), new String[][]{{"getGroupId", "", "2"}, {"toFullString", "", "3"}, {"isUknownVersion", "", "3"}, {"compareTo", "com.fasterxml.jackson.core.Version", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "0"}}, 2), new String[][]{{"getSourceRef", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.StringReader", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=0, getCurrentToken=START_O...#369#-469687669", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", "int,int", "-2147483648", "10"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 2), new String[][]{{"isExpectedStartArrayToken", "", "6"}, {"getIntValue", "", "1"}, {"getTextLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#388#-424508258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}), new String[][]{{"isExpectedStartArrayToken", "", "3"}, {"getEmbeddedObject", "", "4"}, {"getTokenLocation", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{" 0x13456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"d0x13456789"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "-9223372036854775808"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-40"}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-40", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"65496"}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65496", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"65479"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("65479", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"131019"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("131019", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"262005"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("262005", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"131002"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("131002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-131002"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-131002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", " 0x13456789"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "d0x13456789"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"10", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"10", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1), new String[][]{{"isEnabled", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"PT11"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"1.12345678901234567", "<sample:6>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"1.1234C5678901234567", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:6>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "C"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"-1.abcc"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "-36"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, null, 2), new String[][]{{"getFloatValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, null, 2), new String[][]{{"getFloatValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#107864609", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#107864609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:2>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "-8"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<empty>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String,java.lang.Throwable", "1e10", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-524294"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-968003096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-968003096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"10", ".5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "0x1F", "<sample:7>", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "-1"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#-1215290449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "1.1234567890123456"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", new String[]{"java.lang.String"}, new String[]{"1"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", "int,int", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "1.5f"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "java.lang.Class", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"null", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "1"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"null", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "-2147483648"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"2147483640"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"0xFFFFFFFF", "<null>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"tlrue", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1.1234567890123", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "Current token ("}}), new String[][]{{"getBooleanValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"12"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-51"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-51", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"1073741773"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741773", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483639"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483639", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"1"}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.5"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.8400000000000001"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.8400000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "1.12345678"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"10", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false), new String[][]{{"getCurrentToken", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "1073741823"}, false), new String[][]{{"getCurrentToken", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#1428457443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"10", "2020-01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", "java.lang.String", "2020-01-01"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"1.5e300", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonLocation", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "C"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{" (from "}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "Hello, World"}}), new String[][]{{"toByteArray", "", "1"}});
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#7789308", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#7789308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "1"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-262142"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1597305907", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1597305907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-1048568"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#1298495754", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#1298495754", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-1048589"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#-2065690743", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#-2065690743", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDecimalValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "a,b,c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"Missing name, in state: "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[77, 105, 115, 115, 105, 110, 103, 32, 110, 97, 109, 101, 44, 32, 105, 110, 32, 115, 116, 97, 116, 101, 58, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}}), new String[][]{{"getValueAsString", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "0x1F", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"0", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"14", "-1048566"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-325559896", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-325559896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"14", "-1048588"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1853448199", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1853448199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"14", "-51"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-1222953174", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-1222953174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"--1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"1.5d", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"", "<sample:8>", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"", "<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", ""}}), new String[][]{{"getText", "", "1"}, {"hasCurrentToken", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "24"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", ""}}), new String[][]{{"getText", "", "1"}, {"hasCurrentToken", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#1149926923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "-2147479552"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#-1215290449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "-2147479552"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#-1215290449", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-1073741819"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-545778814", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-545778814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", ""}}), new String[][]{{"getText", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#-85208353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", ""}}), new String[][]{{"clearCurrentToken", "", "3"}, {"addVirtualWrapping", "java.util.Set", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{}, new String[]{}, false, 16, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", "int", "10"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "1e10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "-2147483648"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#391#252552924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:0>", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream", "<sample:0>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "--1"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#1841447331", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", "int,int", "1", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", "int", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-507358282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "Title"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "Titl"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#383#1256923799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"rq", "<sample:6>", "<sample:7>"}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"rC", "<sample:6>", "<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"", "<sample:5>", "<sample:6>"}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"i", "<null>", "<sample:6>"}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"PT1/H", "<sample:1>", "<sample:7>"}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"PT1/H1.12345678901234567", "<sample:1>", "<sample:7>"}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"PT1/Hta", "<sample:2>", "<sample:6>"}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonParseException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", "double", "1.7976931348623158E307"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.Writer"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportError", "java.lang.String", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-dataformat-xml, getGroupId=com.fasterxml.jackson.dataformat, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnkn...#217#-1956364070", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
}
