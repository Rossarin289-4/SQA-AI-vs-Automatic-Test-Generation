package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:8>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483599", "-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "2020-01-01"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"414.00000000000006"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "i2020-01-01", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"start an object"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", "java.lang.Object", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483599", "-1073741799"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"0", "10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<sample:5>", "-1073741799", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:1>", "-2147483648", "-2147483648"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getStaxWriter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-1073741794", "57"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "write number"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "write number", "1", "-1"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}}), new String[][]{{"getPrettyPrinter", "", "1"}, {"getCurrentValue", "", "5"}, {"getCharacterEscapes", "", "7"}, {"_handleEndObject", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:4>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:3>", "<sample:9>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<sample:2>", "0", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:0>", "<sample:6>"}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "-0.36"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:0>", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<sample:4>", "0", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#229#-1067102718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:8>", "<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<null>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<sample:0>", "20", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", new String[]{"javax.xml.namespace.QName"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", "int,int", "-2147483648", "1"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", ",1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#-1199331807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "-4294967273"}}), new String[][]{{"writeBinary", "java.io.InputStream,int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<s:keyT>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "double", "-1.7976931348623157E308"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteBinaryNatively", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:key<:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "char[],int,int", "<sample:1>", "-57", "2147483583"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", "UTF-8", "-2147483599", "-1073741818"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"X0F-8", "\037\n Iello- .WorldI1.5e3X01.1234567"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", "134577890121E-5", "0", "-1073741799"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=11, getHighestEscapedChar=0, getOut...#231#1278004302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false), new String[][]{{"setNextNameIfMissing", "javax.xml.namespace.QName", "5"}, {"setNextIsUnwrapped", "boolean", "3"}, {"close", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.lang.String", ", expecting field name"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:0>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndObject", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "char[],int,int", "<empty>", "-1073741799", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "1073741734", "-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:12>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<null>", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:8>", "-1073741811", "2147483647"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "-2.69"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<sample:0>", "-2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483208", "-1073741823"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:14>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:0>", "<sample:3>", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:-42>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:12>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "10"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:12>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5d", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_checkStdFeatureChanges", "int,int", "1970174", "-1073741603"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#228#-713715353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "double[],int,int", "<sample:0>", "42", "-2147483599"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=64, getHighestEscapedChar=0, getOut...#231#-367186644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"D3write law value", "false"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:11>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "1970174"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRepeatedFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"0,a,c", "9223371487098961919"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", "int", "1879048191"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1879048191, getFormatFeatures=2147483647, getHighestEscap...#247#1170010713", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", "boolean", "true"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=255, getFormatFeatures=256, getHighestEscapedChar=0, getO...#233#-1460929246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:6>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "1E+100"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 3), new String[][]{{"close", "", "7"}, {"inRoot", "", "7"}, {"setNextIsAttribute", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#228#-973972857", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#228#-973972857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:F>"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "true"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:3>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-2147483599", "-1", "-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "1E+100"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-2147483599", "-1", "-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"PT1H", "0.1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483599", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:3>", "false"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"-0.0"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"-0.0"}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=12, getHighestEscapedChar=0, getOut...#231#141776272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"41.4"}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#229#-1067102718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"414.0"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"414.00000000000006"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"-177.00000000000003"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=18, getHighestEscapedChar=0, getOut...#231#1232549591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=34, getHighestEscapedChar=0, getOut...#231#-1594577899", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=66, getHighestEscapedChar=0, getOut...#231#-2053366482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=64, getHighestEscapedChar=0, getOut...#231#-367186644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<sample:1>", "2147483647", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=64, getHighestEscapedChar=0, getOut...#231#-367186644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<sample:1>", "2147483647", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=100, getHighestEscapedChar=0, getOu...#232#-246370420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:=>"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "1.0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "3.4028235E38"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:1>", "-2147483647", "-2147483648"}, false, 15, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", "1.5d", "<empty>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#237#-55928443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#228#-62927897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#228#848117063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String", "-0.1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1073741799", "-2147483599"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1073741799", "-2147483599"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1073741799", "-2147483599"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#229#-1067102718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1073741799", "-2147483591"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "/a/b", "1", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=9, getHighestEscapedChar=0, getOutpu...#229#1405487266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=32, getHighestEscapedChar=0, getOut...#231#91601939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("64", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=64, getHighestEscapedChar=0, getOut...#231#-367186644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=100, getHighestEscapedChar=0, getOu...#232#-246370420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleEndObject", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:3>", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[]", "<empty>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"VTF.9", "true"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:-1073741824>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", "int,int,int", "-1", "1", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-01-011.1234567890123456", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", "int,int,int", "-1", "-2147483648", "-2147483648"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputBuffered", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"<null>", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<sample:5>", "-1073741799", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:1>", "-2147483648", "-2147483648"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "1.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<null>", "-2147483648", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=100, getHighestEscapedChar=0, getOu...#232#-246370420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=100, getFormatFeatures=255, getHighestEscapedChar=0, getO...#233#-1437770078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=255, getFormatFeatures=256, getHighestEscapedChar=0, getO...#233#-1460929246", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=256, getFormatFeatures=1000, getHighestEscapedChar=0, get...#234#80288249", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1000, getFormatFeatures=-2, getHighestEscapedChar=0, getO...#233#-869702381", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=12, getHighestEscapedChar=0, getOut...#231#141776272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "NaN"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=12, getHighestEscapedChar=0, getOut...#231#141776272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "NaN"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "NaN"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=32, getHighestEscapedChar=0, getOut...#231#91601939", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "NaN"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=64, getHighestEscapedChar=0, getOut...#231#-367186644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArrayFieldStart", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#228#1759162023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArrayFieldStart", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#228#-1624760313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArrayFieldStart", "java.lang.String", "1.5"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#228#-713715353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<null>", "<empty>", "2147483647", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#229#-1067102718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=9, getHighestEscapedChar=0, getOutpu...#229#1405487266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "double", "Infinity"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3), new String[][]{{"typeDesc", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=10, getHighestEscapedChar=0, getOutp...#230#1300636063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "double", "Infinity"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", ""}}, 3), new String[][]{{"typeDesc", "", "3"}, {"pathAsPointer", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.JsonPointer", actual.getClass().getName());
  assertEquals(" {getMatchingIndex=-1, getMatchingProperty=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=10, getHighestEscapedChar=0, getOutp...#230#1300636063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"short"}, new String[]{"2"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"+1start an array", "-0.128"}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<sample:0>", "-1073741799", "10"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", new String[]{"java.lang.String"}, new String[]{"WRTE_XML_1_1"}, false, 15, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "double[],int,int", "<null>", "2147483647", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "short", "32767"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-1", "10"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"30", "1", "-52"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", "java.lang.String,boolean", "1.1234567890123456", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"write null value", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"1", "-2147483648", "10"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"1", "-2147483648", "10"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", " ", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-2147483648", "2147483647"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-2147483599", "-1", "2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "1E+100"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:8>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"PT1H", "0.1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"write boolean value", "1", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[]", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483599", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "i2020-01-01"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:4>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-2147483599", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:3>", "true"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:6>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"0.0"}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:12>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypePrefix", "com.fasterxml.jackson.core.type.WritableTypeId", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypePrefix", "com.fasterxml.jackson.core.type.WritableTypeId", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypePrefix", "com.fasterxml.jackson.core.type.WritableTypeId", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypePrefix", "com.fasterxml.jackson.core.type.WritableTypeId", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypePrefix", "com.fasterxml.jackson.core.type.WritableTypeId", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#229#-1067102718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=10, getHighestEscapedChar=0, getOutp...#230#1300636063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=11, getHighestEscapedChar=0, getOut...#231#1278004302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=12, getHighestEscapedChar=0, getOut...#231#141776272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=18, getHighestEscapedChar=0, getOut...#231#1232549591", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "-1", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleEndObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<null>", "2147483647", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String", "a"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String", "a"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"I"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<sample:0>", "1", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", ".5", "-2147483599", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:2>", "<empty>", "1", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "true"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", ".5", "-1073741799", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"-2147483599", "-1073741799"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", "1.5d", "<empty>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#228#848117063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#228#1759162023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#228#-1624760313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArrayFieldStart", "java.lang.String", "1.5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#1795210145", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#1795210145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#228#-713715353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"0x123456789", "Infinity"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"java.io.Reader", "int"}, new String[]{"<null>", "-1073741799"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#1413424036", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#1413424036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectRef", "java.lang.Object", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "long[],int,int", "<null>", "2147483647", "-2147483599"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1073741799", "-2147483591"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "/a/b", "1", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=9, getHighestEscapedChar=0, getOutpu...#229#1405487266", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1074266087", "-2147483591"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "/a/b", "1", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=10, getHighestEscapedChar=0, getOutp...#230#1300636063", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<null>", "-1074266087", "-2147483591"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=11, getHighestEscapedChar=0, getOut...#231#1278004302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=12, getHighestEscapedChar=0, getOut...#231#141776272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=16, getHighestEscapedChar=0, getOut...#231#-1376237867", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=64, getFormatFeatures=100, getHighestEscapedChar=0, getOu...#232#-246370420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEmbeddedObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"a b"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<null>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleEndObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:3>", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"123456789012345678901234567890", "1.5d"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"start an object1.1", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String", "0eFFFFFFFF"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"start anobject1.1", "true"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"VTF.9", "false"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:-1073741824>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", "int,int,int", "-1", "1", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"1E-5", "1", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1L", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<sample:2>", "-1073741799", "-2147483599"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:2>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:2>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:2>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_checkStdFeatureChanges", "int,int", "1", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:6>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"writeRawValue"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", "WRITE_XML_1_1", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "Iull"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=8, getHighestEscapedChar=0, getOutpu...#229#-1067102718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"short"}, new String[]{"-32768"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_throwInternal", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=12, getHighestEscapedChar=0, getOut...#231#141776272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectRef", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"1L", "3.4028235E38"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "short", "32767"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=64, getHighestEscapedChar=0, getOut...#231#-367186644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"0x123456789", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", "java.lang.String,java.lang.String", "0x123456789", "1.1234567"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-2147483648", "-1"}, false), new String[][]{{"setNextIsUnwrapped", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=-2147483648, getHighestEscapedChar=0...#239#1872512843", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=-2147483648, getHighestEscapedChar=0...#239#1872512843", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<empty>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "char[],int,int", "<null>", "0", "1"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNull", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNull", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-27167167", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-27167167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#1141029088", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#1141029088", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=1, getHighestEscapedChar=0,...#238#-1818475810", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=1, getHighestEscapedChar=0,...#238#-1818475810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}}), new String[][]{{"getFeatureMask", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=1, getHighestEscapedChar=0,...#238#-1818475810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "2020-02-30T25:61:61"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}}), new String[][]{{"getFeatureMask", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=4, getHighestEscapedChar=0,...#238#2094705377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", "java.lang.String", "WRITE_XML_1_1"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", "java.lang.String,java.lang.String", "write number", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", "java.lang.String", "WRITE_XML_1_1"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", "java.lang.String,java.lang.String", "vrite number", "-1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"WRITE_XML_DECLARATION"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"TlnXe"}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "1.5d"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#-1063134333", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#-1063134333", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "java.lang.String", "1.5"}}), new String[][]{{"getCodec", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", "java.lang.Object", "<i:-60>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", "java.lang.Object", "<i:-100>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:2>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideStdFeatures", "int,int", "1", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:4>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:5>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:5>", "<sample:4>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<sample:3>", "2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:2>", "<sample:0>", "62"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEmbeddedObject", "java.lang.Object", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:5>", "<sample:1>", "-1048440"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "write boolean value", "-2147483648", "-53"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEmbeddedObject", "java.lang.Object", "<i:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "\u00e9", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<empty>", "10"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", "java.lang.String", "*"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<empty>", "10"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", "java.lang.String", "*"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeUTF8String", "byte[],int,int", "<sample:1>", "-2147483648", "-1073741799"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false), new String[][]{{"version", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.8 {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=8, isSnapshot=false, isUknownVersion=false, isUnknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false), new String[][]{{"version", "", "5"}, {"getPatchLevel", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<empty>", "2147483647", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "I", "<i:-1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
}
