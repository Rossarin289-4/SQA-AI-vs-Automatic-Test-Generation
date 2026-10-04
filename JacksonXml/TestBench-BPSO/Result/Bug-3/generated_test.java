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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", "int", "5"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-dataformat-xml, getGroupId=com.fasterxml.jackson.dataformat, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnkn...#217#-1956364070", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", "boolean", "true"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", ""}}), new String[][]{{"getValueAsInt", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-97516171", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "boolean"}, new String[]{"<sample:4>", "true"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:8>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"f"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "\n"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}}, 1), new String[][]{{"getEmbeddedObject", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:2>", "true"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1703916551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", "int,int", "5", "-2147483636"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1853448199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "0xFFFFFFFF"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"/"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#107864609", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#107864609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"0", "1.5d"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "-2147483648", "ac"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", "java.lang.String", "http://exammple.com/a?b=c"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "-2147483648", ")9 1.1234567890123456"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "255"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#537464087", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#537464087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"+1", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<s:\">"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-311902776", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-311902776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"2147483647", "http://example.com/a?b=c"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", "java.lang.String,java.lang.Throwable", "5.", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{".59-1", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "--1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"-2147483590"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "\t"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"5", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1105995194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1105995194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnsupportedOperation", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", "int,int", "12", "40"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "Missing name, in state: "}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"9223372036787666943"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036787666943", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", "com.fasterxml.jackson.core.type.TypeReference", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "1.b5"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", "long", "9223372036854775807"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"Hello, WorldPT1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 80, 84, 49, 72]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDecimalValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"1E.5Title"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483647", "0"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"255", "4194559"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#537464087", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#537464087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:7>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"5", "37"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:0>"}}, 3), new String[][]{{"configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"aac"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "1.2M5"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-dataformat-xml, getGroupId=com.fasterxml.jackson.dataformat, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnkn...#217#-1956364070", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<empty>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", new String[]{"java.lang.String"}, new String[]{"aboc"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:10>", "true"}}, 3), new String[][]{{"getValueAsLong", "long", "5"}, {"getTokenLocation", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnexpectedChar", new String[]{"int", "java.lang.String"}, new String[]{"-2147483648", "e"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[104, 116, 116, 112, 58, 47, 47, 101, 120, 97, 109, 112, 108, 101, 46, 99, 111, 109, 47, 97, 63, 98, 61, 99]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentToken", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAsTree", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "-2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.OutputStream"}, new String[]{"<sample:6>", "<sample:4>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", new String[]{"int"}, new String[]{"-262143"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.ByteArrayBuilder", actual.getClass().getName());
  assertEquals("{getCurrentSegment=?, getCurrentSegmentLength=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setXMLTextElementName", new String[]{"java.lang.String"}, new String[]{"1.25214483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"Hello, World", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{"0x123456<89"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_codec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\000\u007f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-2147418111"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#388#1735971711", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#388#1735971711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", new String[]{"int", "java.lang.String"}, new String[]{"1", ";1L"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"1.25a"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", ""}}), new String[][]{{"getEmbeddedObject", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-545778814", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"java.lang.String", "com.fasterxml.jackson.core.util.ByteArrayBuilder", "com.fasterxml.jackson.core.Base64Variant"}, new String[]{"1.12345678901234567-0.0", "<sample:0>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", "java.lang.String", "-1.12345678"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:10>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:3>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#386#-109148711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "1073741836"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", new String[]{"int"}, new String[]{"241"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", new String[]{"java.lang.String"}, new String[]{"2020.01-01"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "2147483647", "1L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", "java.lang.String,java.lang.Throwable", "", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextLongValue", new String[]{"long"}, new String[]{"-4611686018427387903"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextToken", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\004\005\006", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "requiresCustomCodec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{".4f"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<null>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"17179869184"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("17179869184", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\u007f\002\003", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\ufffd", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", "int", "255"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportError", new String[]{"java.lang.String"}, new String[]{")1.25"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextCharacters", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-311902776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"32769", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-507358282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-507358282", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", "java.io.Writer", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "nulllB"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<empty>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\003\004", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"10", "-63"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", ""}}), new String[][]{{"isClosed", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"13"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readBinaryValue", new String[]{"java.io.OutputStream"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", "int", "-2147483647"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#-729577634", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartObjectToken", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-1048385"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", "char", "o"}}), new String[][]{{"getCurrentToken", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#1998048643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_releaseBuffers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleUnrecognizedCharacterEscape", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTypeId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportError", "java.lang.String", "Hello, Wold"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.core.JsonParser$Feature,boolean", "<sample:6>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", new String[]{"int"}, new String[]{"-257"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{" "}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[32]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String"}, new String[]{"e"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasToken", new String[]{"com.fasterxml.jackson.core.JsonToken"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasCurrentToken", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_handleEOF", ""}}), new String[][]{{"getArtifactId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("jackson-dataformat-xml", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[49, 50, 58, 51, 48, 58, 52, 53]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", new String[]{"java.lang.Class"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getCharDesc", new String[]{"int"}, new String[]{"-1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\uffff' (code -1)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextIntValue", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonParser$Feature"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "3-0.0"}}), new String[][]{{"getValueAsString", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-1543717194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getCharDesc", new String[]{"int"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(CTRL-CHAR, code -2147483648)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getStaxReader", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"20", "-1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#1216414113", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#1216414113", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[50, 48, 50, 48, 45, 48, 49, 45, 48, 49]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483618", "2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-1029525581", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-1029525581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getIntValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "TitleMissing name, in state: true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "20"}, false), new String[][]{{"getValueAsString", "java.lang.String", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-1350253817", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483647", "-10"}, false, 7, new String[][]{}), new String[][]{{"configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{")"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[41]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBigIntegerValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "http://exam2ple.com/a?b=c"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}}), new String[][]{{"getPatchLevel", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 70, 70, 70, 70, 70, 70, 70, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#2080334111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "configure", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature,boolean", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFormatFeatures", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", "java.lang.String", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"Current token ("}, true);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[67, 117, 114, 114, 101, 110, 116, 32, 116, 111, 107, 101, 110, 32, 40]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483626"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "1<-4"}}), new String[][]{{"getValueAsString", "", "5"}, {"getBigIntegerValue", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#-1660358433", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_isEmpty", "java.lang.String", "2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-dataformat-xml, getGroupId=com.fasterxml.jackson.dataformat, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnkn...#217#-1956364070", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"1073741823"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", "com.fasterxml.jackson.core.Base64Variant", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "clearCurrentToken", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "5"}, false), new String[][]{{"getShortValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#1992822458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getEmbeddedObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setCurrentValue", "java.lang.Object", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFeatureMask", ""}}), new String[][]{{"getTokenLocation", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("\002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getCharDesc", new String[]{"int"}, new String[]{"-524352"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\uffc0' (code -524352)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", new String[]{"java.lang.String"}, new String[]{"<a>bua>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{"010214748;648", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_wrapError", new String[]{"java.lang.String", "java.lang.Throwable"}, new String[]{".5", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "33"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", "java.util.Set", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#8495938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getByteArrayBuilder", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}}), new String[][]{{"write", "byte[],int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}), new String[][]{{"getShortValue", "", "4"}, {"getFloatValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#-215682801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getShortValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Short", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"-31"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "addVirtualWrapping", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportMissingRootWS", "int", "-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_asciiBytes", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFCF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[B", actual.getClass().getName());
  assertEquals("[48, 120, 70, 70, 70, 70, 70, 70, 70, 67, 70]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "close", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#107864609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"20"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("20", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", "int,int", "-10", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#393#478481111", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOF", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-67108866"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-67108866", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "<a>b</a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_decodeBase64", new String[]{"com.fasterxml.jackson.core.Base64Variant"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextTextValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getFloatValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "hasTokenId", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "releaseBuffered", new String[]{"java.io.OutputStream"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDecimalValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentTokenId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsString", new String[]{"java.lang.String"}, new String[]{""}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLongValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentLocation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-1.7976931348623158E307"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7976931348623158E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValuesAs", new String[]{"com.fasterxml.jackson.core.type.TypeReference"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isExpectedStartArrayToken", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getNumberValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311579E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "skipChildren", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnexpectedChar", "int,java.lang.String", "268435465", "0xx1F"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", actual.getClass().getName());
  assertEquals("{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", "com.fasterxml.jackson.core.Base64Variant", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getParsingContext", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "enable", "com.fasterxml.jackson.core.JsonParser$Feature", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#385#-311902776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ascii", new String[]{"byte[]"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483627"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getCurrentName", ""}}), new String[][]{{"getEmbeddedObject", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#394#-85208353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getText", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwUnquotedSpace", "int,java.lang.String", "2097151", "+1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getInputSource", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "33554432"}, false), new String[][]{{"getValueAsString", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#391#907148226", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_getCharDesc", new String[]{"int"}, new String[]{"255"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'\u00ff' (code 255)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String,java.lang.Throwable", "", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"22.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String", "("}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("22.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsInt", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "canReadObjectId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "overrideCurrentName", new String[]{"java.lang.String"}, new String[]{"`g"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_constructError", "java.lang.String,java.lang.Throwable", "PXT1H", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "readValueAs", new String[]{"java.lang.Class"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_hasTextualNull", "java.lang.String", "trud"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTokenLocation", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getLastClearedToken", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", new String[]{"long"}, new String[]{"16777216"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getBinaryValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("16777216", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "version", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getDoubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportInvalidEOFInValue", ""}, {"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsLong", "long", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getByteValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_reportUnexpectedChar", "int,java.lang.String", "-1", "--1-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Byte", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getValueAsDouble", new String[]{"double"}, new String[]{"Infinity"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextBooleanValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "nextFieldName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "getTextOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_throwInvalidSpace", "int", "-2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canReadObjectId=false, canReadTypeId=false, getBigIntegerValue=null, getBinaryValue=!NullPointerException, getBooleanValue=!NullPointerException, getByteValue=0, getCurrentName=!NullPointerException,...#384#-58661643", SearchInputFactory_scaffolding.receiverState());
 }
}
