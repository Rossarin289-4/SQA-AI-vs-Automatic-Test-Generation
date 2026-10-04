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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "2", "1.1234567890123456"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", "java.lang.String", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "TITLE"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", "int,int", "0", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "I"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "291"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=[], getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=VALUE_STRING, getCurrent...#352#1444669026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnexpectedChar", "int,java.lang.String", "2147483647", "<a>b</a>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "1099511627775"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "Current token ("}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", "java.lang.String", "):n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=Current token (, getCurren...#382#2123306355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#389#404486544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", "int,int", "2147483647", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#391#-809002010", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "java.lang.Class", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:7>", "true"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"0.0"}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "F010"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=F010, getCurrentToken=null...#364#952489274", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=a, getCurrentToken=FIELD_N...#367#1340956332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "-0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "12"}});
  assertNotNull(actual);
  assertEquals("[C", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "1", "1.1234567890123456"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "1e10"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "9223372036854251519"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "9223372036854775807"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:5>", "true"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "-9223372036854775808"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "java.lang.Class", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"aaaaaaaaaaaaabaaaaaaaaaaaaaaaa", "<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=[], getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=VALUE_STRING, getCurrent...#360#-420867923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("START_OBJECT", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=[], getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=VALUE_STRING, getCurrent...#352#1444669026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:5>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "-1"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", "int", "0"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", "java.lang.String,java.lang.Throwable", "http://example.com/a?b=c", "<sample:3>"}}, 2), new String[][]{{"getStaxReader", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", "java.lang.String,java.lang.Throwable", "http://example.com/a?b=c", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#1428457443", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#1428457443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#1269372750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#1269372750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483606"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#732667346", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#732667346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2013265878"}, false, 0, null, 2), new String[][]{{"getInputSource", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-1176909877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"http://example.com/a?b=c", "<sample:5>", "<sample:6>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"B"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"C"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"(B"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[40, 66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"("}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[40]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{" (from "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 40, 102, 114, 111, 109, 32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"-1b"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[45, 49, 98]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"24", "-1073741823"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}}, 2), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getTextLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-8", "-1073741823"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}}, 2), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getTextLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#-570492941", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", "int,int", "10", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1073676326", "-2147483456"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}, 1), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getTextLength", "", "1"}, {"getFloatValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "http://example.com/a?b=c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "hstp://example.co6m/a?b=c"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "-2147483648", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "-2147483648", "1.5e300"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"46", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", ""}}, 3), new String[][]{{"getValueAsBoolean", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"46", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", ""}}, 3), new String[][]{{"getValueAsBoolean", "boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1048576", "-1014"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", ""}}, 3), new String[][]{{"getValueAsBoolean", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1492549590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1048576", "17"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", ""}}, 3), new String[][]{{"getValueAsBoolean", "boolean", "0"}, {"getValueAsDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1E-5truehttp:/.example.com/a?b=c+1"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<d:0.15>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1-E-5tsvehttp:/.example.com0a?b=c+1"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, null, 3), new String[][]{{"getTextLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 11, new String[][]{}, 1), new String[][]{{"getTextLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 11, new String[][]{}, 1), new String[][]{{"getTextLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "false"}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 11, new String[][]{}, 1), new String[][]{{"getTextLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "1", "1.1234567890123456"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"1048576"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1492549590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1492549590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"1048576"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1492549590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1492549590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"1048633"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-93198696", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-93198696", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2097266"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-1254379109", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-1254379109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "9223372036854775807"}}), new String[][]{{"getSchema", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "9223372036854251519"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"12:30:45", "<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String"}, new String[]{")"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:17>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", "java.lang.String,java.lang.Throwable", "1L", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "10", "2020-01-01"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"1048576"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String,java.lang.Throwable", "): ", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", new String[]{}, new String[]{}, false, 16, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", "int,int", "2147483647", "1"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "1.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", "boolean", "false"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.OutputStream", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDecimalValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"-2147483648", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-97516171", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-97516171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-3"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#799877107", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#799877107", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-3"}, false), new String[][]{{"getValueAsDouble", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#799877107", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", "java.io.OutputStream", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2146435071", "-3"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", ""}}), new String[][]{{"getValueAsDouble", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-758519641", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2146435071", "3"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", ""}}), new String[][]{{"getValueAsDouble", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1404751560", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2146435071", "-48"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", ""}}), new String[][]{{"getValueAsDouble", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#1288771942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonToken", actual.getClass().getName());
  assertEquals("VALUE_STRING", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=[], getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=VALUE_STRING, getCurrent...#360#-420867923", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:4>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-311902776", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-311902776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"10", "1"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#7789308", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#7789308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#1097445400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#1097445400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "true"}}), new String[][]{{"getValueAsDouble", "double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#-459962768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "1.1234567890123456"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "\uffff"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}}), new String[][]{{"getValueAsDouble", "double", "6"}, {"getValueAsBoolean", "", "0"}, {"getDoubleValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "4"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "\uffff"}}), new String[][]{{"getValueAsDouble", "double", "6"}, {"getValueAsBoolean", "", "0"}, {"getDoubleValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "4"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "\uffff"}}), new String[][]{{"getCurrentLocation", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:9>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{" "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "9223372036854775807"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:7>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "0", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportError", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"http://example.com/a?b=c", "<sample:5>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[-23]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{" (from"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32, 40, 102, 114, 111, 109]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{")"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"*"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[42]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"B"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[66]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"C"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1", "1048576"}, false), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getCurrentValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#1492549590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-1", "-1048576"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getCurrentValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#1181557735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"0", "1048576"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getValueAsBoolean", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "1048518"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getValueAsBoolean", "", "7"}, {"getValueAsString", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#390#-135135970", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "-2097112"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", ""}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "1"}, {"getValueAsLong", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "1"}, {"getValueAsLong", "", "5"}, {"getTextLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"16384", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "1"}, {"getValueAsLong", "", "5"}, {"getTextLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#388#-1211190289", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-15", "-1073741823"}, false, 15, new String[][]{}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "3"}, {"getValueAsLong", "", "5"}, {"getTextLength", "", "1"}, {"getFloatValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#914562610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", new String[]{"java.util.Set"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{" (from "}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getCharDesc", new String[]{"int"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code 0)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 10, new String[][]{}), new String[][]{{"getTextLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1266194551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 10, new String[][]{}), new String[][]{{"getTextLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#7789308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 10, new String[][]{}), new String[][]{{"getTextLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#107864609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 10, new String[][]{}), new String[][]{{"getTextLength", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#945795837", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "true"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant", "\u00e9", "<sample:5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBooleanValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"10"}, false), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", "com.fasterxml.jackson.core.JsonToken", "<sample:6>"}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:3>"}}, 2), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#796646728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}}), new String[][]{{"isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "5"}, {"getCurrentName", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"i", "<sample:2>", "<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "\th"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "\th"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "6h"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:5>", "true"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "+"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-545778814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String,java.lang.Throwable", "0x1F", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "+"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "): "}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "10"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "): "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#-740377191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "0():!"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}), new String[][]{{"getStaxReader", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "I"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "1.12345678"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#389#-1468292162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String,java.lang.Throwable", "0x1F", "<sample:0>"}}), new String[][]{{"getFormatFeatures", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#390#190403608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=!IllegalStateException, ge...#382#356391780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "10"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!JsonParseException, getBooleanValue=!JsonParseException, getByteValue=0, getCurrentName=b, getCurrentToken=FIELD_N...#367#300664493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.core.JsonParser$Feature", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.0-rc4 {getArtifactId=jackson-dataformat-xml, getGroupId=com.fasterxml.jackson.dataformat, getMajorVersion=2, getMinorVersion=7, getPatchLevel=0, isSnapshot=true, isUknownVersion=false, isUnknownVe...#212#-276506021", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
}
