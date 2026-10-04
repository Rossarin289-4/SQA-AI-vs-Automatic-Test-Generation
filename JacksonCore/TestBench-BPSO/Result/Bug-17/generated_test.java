package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "2020-011-01", "<empty>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-80478753", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#363144740", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:5>", "-43", "57"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\nwrite a number", "<i:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#469565085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<b:false>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<sample:5>", "-513"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "-32766"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-2147483648", "4194315"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", "java.lang.Object", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", new String[]{"java.lang.String"}, new String[]{"true, expecting field name117"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "write a number", "1L.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"\t\n123456789012345678901234567890", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "Infinity"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "-2251799813718016"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#92113250", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1304689355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "-1.", "<sample:4>"}}), new String[][]{{"writeNumber", "long", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"2.24", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1706972131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"http://example.com/a?b>b", "110592"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "long[],int,int", "<sample:1>", "1", "180"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1976116317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"116"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "\013)"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1384228990", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:11>", "-55339", "55304"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "78"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "\t\t", "3.4028235E38"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "576460752303423581"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String,int,int", "1.12345678", "57", "188"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "abw"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<sample:8>", "2", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#1274088639", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]"}, new String[]{"<sample:3>", "<sample:5>", "<sample:11>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2013650015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", "int,int", "33", "35"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"float"}, new String[]{"NaN"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:4>", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#952163520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "1.25", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "int[],int,int", "<sample:0>", "2147483647", "44"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-977567044", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", "\nTrite a number"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#19505309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:3>", "57342"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-1207908249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", "1..5awrite a numbf"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5e3000x1F", "6553.5"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#622165567", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:1>", "16", "-537395292"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:5>", "<sample:3>", "<sample:6>", "148"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#159224193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "8191"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "Can neot .5", "<null>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", "aaaaaaaaaaaaaa`aaaaaaaaaaaaaaa", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1370502219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "PT0H", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:2>", "<sample:3>", "<sample:8>", "55295"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1993205588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"start an nbject"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[],int,int", "<null>", "2147483647", "-41984"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1304689355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "-0."}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:3>", "<sample:8>", "<sample:4>"}}), new String[][]{{"writeNull", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<null>", "8388630"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{")"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "\013)"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-527507268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "01\u00e91.023456788117", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-68228902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "-244"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "50"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#849618662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"\u00e9"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<i:-2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#849618662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"write a string", "56317.9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", "int,int", "47", "56258"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2128716799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "8388630", "131070"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", "java.lang.String", "/a/o"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "65535"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "42", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "http9/example.com/a?b>b"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"56296"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "-1.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputSurrogates", new String[]{"int", "int"}, new String[]{"61", "-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "int", "68"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,double", "1.5d0x1F", "510.23499999999996"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "long[],int,int", "<sample:0>", "524380", "55296"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"2020-01-00", "10", "65535"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "124"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-210835896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:5>", "77", "-2"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputSurrogates", new String[]{"int", "int"}, new String[]{"1073741823", "57303"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "512.535"}}), new String[][]{{"writeBinaryField", "java.lang.String,byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-221931596", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-221931596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "4611686018427387904"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:8>", "-134152193"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1859572613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "java.lang.String", "1.13345677"}}, 1), new String[][]{{"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:11>", "2147483647", "524343"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:9>", "-43", "512"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "/x123456689"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1e10--1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String", "01\u00e91.023456781171.1234567890123456"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "202x-01-0", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:1>", "43", "-35"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<null>", "<sample:6>", "-44", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:5>", "2147483647", "-56282"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:9>", "-56319"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "57343"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", "java.lang.String", "write a string"}}), new String[][]{{"writeNumber", "java.math.BigInteger", "0"}, {"writeNumber", "float", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1370502219", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1370502219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "4718743"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1993205588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "01\u00e91.12345578"}}), new String[][]{{"writeArray", "double[],int,int", "0"}, {"writeEndObject", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:6>"}, false), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "4"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:11>", "116", "2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputSurrogates", new String[]{"int", "int"}, new String[]{"2147483647", "56320"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#-1141747711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "int[],int,int", "<null>", "131070", "57344"}}, 3), new String[][]{{"writeNumber", "short", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=22, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-816208581", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=22, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-816208581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "java.lang.String", "writ_ a boolean value bytes (out of "}}), new String[][]{{"writeNumber", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"-524385"}, false, 3, new String[][]{}), new String[][]{{"writeNumber", "double", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false), new String[][]{{"writeNumber", "java.math.BigDecimal", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1438091961", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1438091961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"55216"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "http://ex`mple.com/a?b>b12:30:45"}}), new String[][]{{"writeNumber", "java.math.BigDecimal", "1"}, {"writeNumber", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "33619966", "-58"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "float", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1677180103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"1.5e\u00e9200", "6553.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<s:aH>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1016577662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", "int", "8454142"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "-3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "0", "4"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "-56337"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"writeArrayFieldStart", "java.lang.String", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"\t\n123456789901234567890123456f7890", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#323229353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "5735P", "57343"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-517513780", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-517513780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"writeArrayFieldStart", "java.lang.String", "7"}, {"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-977567044", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#-1812960482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String,int,int", "Can neot ", "-56334", "57335"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-2147483641", "-65534"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1038634658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", "java.lang.String", "-.1I"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "35", "42"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getHighestEscapedChar", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"5734", "0.0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "123", "116"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"write a boolean value"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", "java.lang.String", "u{\"a\":1}"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#862500260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectRef", "java.lang.Object", "<s:key>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "8"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"/a/bHello, World", "88.7"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1438322330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "57", "44"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"true+ e93write a number", "<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<null>", "-2080374784", "528"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"write a number+1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:7>", "<sample:1>", "93"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"write a binary value"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1438322330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"write a string0x1FI", "<s:b>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#1773315322", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"write a boolean value "}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-527507268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"-1.52147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "562949953421405"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#928843451", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", "java.lang.Object", "<b:false>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 1), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=65, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1225922075", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=65, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1225922075", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:7>", "<empty>", "-41984", "56319"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "49"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"573433I", "true"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:3>", "<sample:1>", "65534", "43"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:2>", "<sample:3>", "<sample:0>", "-117"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "57343"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-117", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"1.5e300", "<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "248"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"--11.5", "<d:30.0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-783963349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"58"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", "java.lang.String", "11\u00e91.12345678"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"+1tart an array"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1284244928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:1>", "56319", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"writ", "true"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"true, expecting field name", "56262.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "32767"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1167701224", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"17592186363903"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "126", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String", "a-b1.12345678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"rxFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "268435549", "-41984"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "http://example./com/a?b>c", "2097157", "-61"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-1.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "long[],int,int", "<sample:0>", "22", "-45"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"2020-01-010xFFFFFFFF"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1438322330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"[1,2] "}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "1117", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"float"}, new String[]{"55295.96"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"34"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-359623577", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:8>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"8315", "49"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", "/a/+"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "float", "65535"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"wqite a string", "<i:22>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2013650015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{" bytes (out of a"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1016577662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"1.5e3/0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "-248", "37"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<null>", "-11", "-6291330"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-134572093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"51"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1e110"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "-1", "57299"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1284244928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", " ", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1092914341", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"0xFm"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-44908833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-56376", "94"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:8>", "-33554554", "1073741823"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"113"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"1.5-0.0I", "Infinity"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2013650015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.123456l"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "-20960"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"\n\n", "65535.04"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,double", "17", "117"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "-56317.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-170607581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "5E+99"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-65535.0"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:11>", "57335", "-16777192"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"44", "57343"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"5.", "-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "58"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"8191", "-2"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:0>", "<sample:1>", "<sample:2>", "44"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "2147483647", "65534"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "<null>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"8o"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"bc", "234", "2147483583"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"65536"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=65536, get...#233#1383470063", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=65536, get...#233#1383470063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"-0", "-563190"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-2"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#637448776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"2020-011-01"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteFormattedNumbers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputSurrogates", new String[]{"int", "int"}, new String[]{"-56319", "56319"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{" "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,double", "true, expecting field name", "65540.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"1Title", "17", "103"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"/a/a", "5E+99"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "java.lang.String", "true+ e"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1.5fwrite a numbfr", "16382"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "43", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#172105791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", "java.lang.String", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"1E-s5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1038634658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyPrettyValueWrite", new String[]{"java.lang.String", "int"}, new String[]{"1.5fwrite a numbfrwrite a number", "110592"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", "1127", "95"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"http://example.com/a?b=c", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1169178144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"01\u00e91.12345678"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"a"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "0L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{" bytes (out of ", "28"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1016577662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{".12345678", "169"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1706972131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"tque"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<i:-2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"\u00e9", "123"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#363144740", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"2020-011-01552961L"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"38", "131190"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "java.lang.String", "Titlf"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "start an object"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2013650015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b>c"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-91", "-49"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:15.0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=127, getOu...#231#-1097047636", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"http;//example.bom/a?b>c", "339.936"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "j,b,c", "6553.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"78"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "67137536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=67137536, ...#236#139076153", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"<a>b</a>", "true"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"0xFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "5."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"5.", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x123456789--1", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2013650015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false), new String[][]{{"getGroupId", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("com.fasterxml.jackson.core", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1.12345l678", "91"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"32767"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.12345678901234567", "<s:{>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#862500260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#66170464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "", "56319"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"0-156319", "26.1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", "911.5d"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#862500260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String,int,int", "2020", "2147483647", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"5734348"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"0xEFFFGFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "a,b", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "22"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", "int,int", "513", "112"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1M1.5", "-6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:c>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1113795123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"Sitl", "56319.04600000001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1859572613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]"}, new String[]{"<sample:7>", "<sample:1>", "<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{"TILE"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"write a binary valu57343", "154"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-618272740", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:0>", "0"}}), new String[][]{{"writeRootValueSeparator", "com.fasterxml.jackson.core.JsonGenerator", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:8>", "<empty>", "28160"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\u00e91.1 34567", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{" 1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "-32768"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"write a null.5", "<s:t>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1732375655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"X"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:3>", "<null>", "<null>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "Can not "}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#1314036956", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-210835896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}}), new String[][]{{"compareTo", "com.fasterxml.jackson.core.Version", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "int", "47"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1993205588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"true", "58"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "57", "-2147483648"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", "java.lang.String", "01\u00e91.12345678"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"248"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "48"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=248, getOu...#231#1268591082", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=248, getOu...#231#1268591082", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"i65535", "45"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"5529A"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-338406795", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"47.99999999999999"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", "java.lang.String", "0xFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-783963349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1038634658", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1038634658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "5-", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"2047483648", "96.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1077551106", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:4>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"-4503599627436032"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"++1", "1", "188"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:6>", "<sample:4>", "-1073741824", "27652"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "58"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<empty>", "2147483647", "60"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:5>", "<sample:3>", "<sample:1>", "-56318"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String", "65-1.5"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-56318", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#159224193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "22", "65550"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "/a/a", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:7>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "int[],int,int", "<sample:1>", "-122", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#363144740", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#425278890", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}}), new String[][]{{"getOutputBuffered", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]"}, new String[]{"<sample:5>", "<sample:4>", "<sample:4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-35", "1026"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "a"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-2097153>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-517513780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:4>", "45"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "65536"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:4>", "80", "57335"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"28"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=28, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1515344930", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=28, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1515344930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false), new String[][]{{"setHighestNonEscapedChar", "int", "3"}, {"writeNumber", "java.math.BigInteger", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=1, getOutp...#229#1136177318", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=1, getOutp...#229#1136177318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"16384", "22"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:1>", "-56282", "55234"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "248"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
}
