package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "-31"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=...#206#-621098401", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "-1", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "1.1234567890123456", "138", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}), new String[][]{{"getCurrentValue", "", "4"}, {"getOutputContext", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObject", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", " ", "-9223372034707292160"}}), new String[][]{{"writeNumberField", "java.lang.String,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObject", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", " ", "-9223372034707292160"}}), new String[][]{{"writeNumberField", "java.lang.String,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1651815085", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1651815085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2), new String[][]{{"version", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.2-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=2, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#-2084765692", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-2147483648"}, false), new String[][]{{"canWriteTypeId", "", "4"}, {"getCharacterEscapes", "", "2"}, {"getHighestEscapedChar", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "TITLE", "0.0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "char[],int,int", "<empty>", "0", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "TITLE", "0.0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "char[],int,int", "<empty>", "0", "1"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "java.lang.String", "1.1234567890123456"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=30, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x1F", "<d:1.5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x1F", "<i:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"/x1F", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "java.io.InputStream,int", "<empty>", "10"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Title", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "java.io.InputStream,int", "<empty>", "10"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"itlne", "<i:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "java.io.InputStream,int", "<sample:3>", "10"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "0xFFFFFFFF", "-2147483648", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=17, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "-31"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "-31"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=100, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String", "+1"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,int", "", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-11"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCurrentValue", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"67108853"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCurrentValue", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"-1073741823", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getSchema", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"5-OT"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "1.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "1.5"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-2147483648, isClosed...#207#-698658170", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "1.5"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=-214748364...#218#-1041583997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "null"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-2147483643, isClosed...#207#-1600460561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "null"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-2147483648, isClosed...#207#-1615162421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "null"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=-2147483643, isClosed...#207#-249075343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "-11.5f"}}, 3), new String[][]{{"getDupDetector", "", "2"}, {"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=12, isClos...#209#394678596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}}, 3), new String[][]{{"getDupDetector", "", "2"}, {"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=1, isClose...#208#482065476", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "22"}}, 3), new String[][]{{"getDupDetector", "", "2"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "22"}}, 3), new String[][]{{"getDupDetector", "", "2"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:2>", "22"}}, 3), new String[][]{{"getDupDetector", "", "2"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "22"}}, 3), new String[][]{{"getDupDetector", "", "2"}, {"withDupDetector", "com.fasterxml.jackson.core.json.DupDetector", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "-1.5", "-0.0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "22"}}, 3), new String[][]{{"getDupDetector", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=12, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCodec", ""}}, 2), new String[][]{{"writeNumberField", "java.lang.String,double", "4"}, {"writeNullField", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "<a>b</a>", "Title"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=6, isClose...#208#-208328993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=5, isClose...#208#788743360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{".51.1234567890123456"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=23, isClos...#209#-1446865628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{".51.1234567890123456"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=24, isClos...#209#1851029315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{".51.1234578901224561.1234567"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "flush", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=32, isClos...#209#-1294265146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "58", "138"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "58", "-3"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=2, isClose...#208#-515006877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "10", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "16", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char[],int,int", "<empty>", "-2147483648", "-1"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCharacterEscapes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "16", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char[],int,int", "<empty>", "-2147483648", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCharacterEscapes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-1"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<empty>", "2147483647", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "<a>b</a>3"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "<a>b</a>3"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "<a>b</a>3"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "<a>b</a>3"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-1073741787"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", "TITLE", "-9223372034707292160"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-1073741863"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputContext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=19, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=12, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"withRootSeparator", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "10", "1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "overrideFormatFeatures", "int,int", "1", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "overrideFormatFeatures", "int,int", "1", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UITLE", "1.7:e300"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=15, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UITLE12:30:45", "1.7:e300"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=23, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"-1", "c.7:e310"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=12, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UITLdE12:30:45", "c.7:e310"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=24, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2147483647, getOutputBuffered=0, isClosed=...#206#1364434301", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=2147483647, getOutputBuffered=0, isClosed=...#206#1364434301", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#207#615347428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "TITLE", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=20, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<null>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "TITLE", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=19, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "TITLE", "0.0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "/"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0x1F", "<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_checkStdFeatureChanges", "int,int", "-2147483648", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{" "}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"134217729"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-134217727"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"10", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "1.1234567890123456", "10", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "useDefaultPrettyPrinter", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCharacterEscapes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "Infinity"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCharacterEscapes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"", "-1", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "{\"a\":1}"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "{\"a\":1}"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "{\"a\":1}"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "32767"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "null", "0", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "null", "0", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "null", "0", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-59"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"138", "138"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawUTF8String", "byte[],int,int", "<sample:2>", "10", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=138, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=1, isClosed=false...#201#-699025030", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=138, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=1, isClosed=false...#201#-699025030", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"138", "138"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=138, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#298047323", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=138, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#298047323", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "138"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "138"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1", "2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "\t"}}), new String[][]{{"getOutputBuffered", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"4", "-536870921"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,int", "/a/b", "138"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "32767"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"5-PT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"5-OT"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"i", "-2147483648", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getSchema", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "9223372036854775808"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=20, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("[0] {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ARRAY}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "-1"}}), new String[][]{{"getDupDetector", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "-1"}}), new String[][]{{"getDupDetector", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "-11.5f"}}), new String[][]{{"getDupDetector", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:2>", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "-11.5f"}}), new String[][]{{"getDupDetector", "", "2"}, {"reset", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=12, isClos...#209#394678596", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=128, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1352089476", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=128, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1352089476", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false), new String[][]{{"getCurrentValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 1, new String[][]{}), new String[][]{{"getCurrentValue", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 1, new String[][]{}), new String[][]{{"getCurrentValue", "", "4"}, {"getOutputContext", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}}), new String[][]{{"writeNumberField", "java.lang.String,double", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"<a>b</a>", "<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getOutputContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char", "\uffff"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_verifyValueWrite", "java.lang.String", "123456789012345678901234567890"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "version", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCodec", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_throwInternal", ""}}), new String[][]{{"writeNumberField", "java.lang.String,double", "4"}, {"writeNullField", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"0xFFFFFFFF", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=15, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}), new String[][]{{"getOutputTarget", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:8>"}}), new String[][]{{"getOutputTarget", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}), new String[][]{{"getOutputTarget", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}), new String[][]{{"getOutputTarget", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=2, isClose...#208#-515006877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<sample:2>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<sample:2>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<sample:2>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<sample:2>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<sample:2>", "2147483647", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[],int,int", "<sample:2>", "-2147483647", "2147483647"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}), new String[][]{{"writeTo", "java.io.OutputStream", "0"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals("  {size=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStringField", "java.lang.String,java.lang.String", "<a>b</a>", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"1.12345678901234567", "Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCurrentValue", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObjectId", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=27, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_verifyValueWrite", "java.lang.String", "1.1234567890123456"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=5, isClose...#208#788743360", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=6, isClose...#208#-208328993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeObjectId", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=10, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_writeSimpleObject", "java.lang.Object", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_writeSimpleObject", "java.lang.Object", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_verifyValueWrite", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_writeSimpleObject", "java.lang.Object", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=9, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:2>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-1", "138"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setCurrentValue", "java.lang.Object", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "10", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "10", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "138", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:1>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"-24"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=3, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"59"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=2, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeFieldName", "java.lang.String", "1.12345678"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", "5.", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=7, isClose...#208#-1205401346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"{!!a\":1|"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=8, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportError", "java.lang.String", "-1.5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"TITLE", "1.5e300"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=14, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UITLE", "1.77e300"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=15, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UITLE", "Title"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=12, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UITLE12:30:451.25", "c.7:e310"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=27, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "-32768"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#207#615347428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "-32768"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "32767"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setFeatureMask", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-1, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setFeatureMask", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed...#207#1503531256", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setFeatureMask", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", "\n", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=8, isClose...#208#2092493597", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,long", "\n-1", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=10, isClos...#209#-1906143994", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"\n1,\tb200-001-01true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "1.12345678901234567", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=27, isClos...#209#-1140187744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"\n1,\tb200-001-01true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigDecimal", "0"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumberField", "java.lang.String,float", "1.12345678901234567", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=32, isClos...#209#-1294265146", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"\n1,\tb200.001-01true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigDecimal", "0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=4, isClose...#208#1785815713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"/"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigDecimal", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=7, isClose...#208#-1205401346", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"/"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigDecimal", "1E+100"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=104, isClo...#210#1675451648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"I"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "1E-5", "10", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "abc", "10", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "abc", "10", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "abc", "10", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "3.4028235E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=17, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"5."}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "abc", "10", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "3.4028235E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=15, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"<<E-5"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "abc", "10", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "3.4028235E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=18, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"-0.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "java.lang.String,int,int", "abc", "10", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "3.4028235E38"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=21, isClos...#209#547279078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"u l\"--1010"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "3.4028235E38"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeTypeId", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=28, isClos...#209#-2137260097", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{" l\"--1010"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "float", "3.4028235E38"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeTypeId", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=27, isClos...#209#-1140187744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"\000"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"\000"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{","}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeUTF8String", "byte[],int,int", "<null>", "0", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{" ", "true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=5, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "byte[]", "<sample:0>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "short", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "setHighestNonEscapedChar", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"0xFFFFFFFF", "2147483647", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"0xFFFFFFFF", "2147483647", "-2147483629"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"3", "1073741822", "-2147483648"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClose...#208#1479137829", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"<a>b</a>", "1073741822", "-2147483648"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"HelFlo, Workd", "-2147483591", "-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=2, isClose...#208#-515006877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"HelFlo, Workd", "-2147483591", "-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=4, isClose...#208#1785815713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"HelFlo, Workd", "-2147483591", "-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=2, isClose...#208#-515006877", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{"1"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeBinary", "java.io.InputStream,int", "<null>", "-1"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeStartArray", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.math.BigInteger", "2147483648"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "long", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=17, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=6, isClosed=false...#201#955685389", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=6, isClosed=false...#201#955685389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "char", " "}}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=1, isClosed=false...#201#1646079858", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=1, isClosed=false...#201#1646079858", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=3, isClosed=false...#201#-348064848", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=3, isClosed=false...#201#-348064848", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=4, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "\nI"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1651815085", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=130, getFormatFeatures=0, getHighestEscapedChar=127, getOutputBuffered=0, isClosed=false...#201#-1651815085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"float"}, new String[]{"1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "1.5e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=11, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeOmittedField", "java.lang.String", "\nI"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}, {"writeBinary", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"writeBinary", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "{\"a\":1}"}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"getCurrentValue", "", "6"}, {"canWriteObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=7, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeArrayFieldStart", "java.lang.String", "5."}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "{\"a\":1}"}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"getCurrentValue", "", "6"}, {"canWriteObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=1, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"getCurrentValue", "", "6"}, {"canWriteObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=6, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "{\"a\":1}"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}}, 3), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"getCurrentValue", "", "6"}, {"canWriteObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeNumber", "java.lang.String", "{\"a\":1}"}, {"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_reportUnsupportedOperation", ""}}), new String[][]{{"enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "3"}, {"getCurrentValue", "", "6"}, {"canWriteObjectId", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.JsonGeneratorImpl", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.JsonGeneratorImpl", "writeRawValue", "java.lang.String", "[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutputBuffered=0, isClosed=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
