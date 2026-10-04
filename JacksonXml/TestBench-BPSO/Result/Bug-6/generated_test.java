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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1073741824", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "version", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#-31135552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#-31135552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "unknown"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"short"}, new String[]{"32767"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", "int,int", "1073741824", "67108862"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "-33554431", "56"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", "int,int", "-8405012", "-67108861"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<null>", "64"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-28", "134217728"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "-3.4028235E38"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", "java.lang.String,long", "http://example.c/om.a?b=c010", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0.360"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:6>", "<sample:6>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:3>", "-10", "-33554391"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#228#-62927897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", "java.lang.String", "UT"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:4>", "-8405067", "-4186122"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-8404979"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "int", "2147483646"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"write Binary ualue", "\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", "java.lang.String,int", "", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"0xFFFFFFFFF", "-1E+100"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<null>", "<sample:10>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"wq"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:10>", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.lang.String", "0xFFFFFEFF"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"1E-W5", "-4.9E-324"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "java.io.InputStream,int", "<null>", "69"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<sample:0>", "4194870", "-2147483610"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", "java.lang.Object", "<b:true>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:5>", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}}), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}, {"getFeatureMask", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#229#1795210145", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<null>", "2147483647", "6291546"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "char", "r"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", ""}}), new String[][]{{"finishWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<s:keUy>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", "java.lang.Object", "<b:false>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRepeatedFieldName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_decodeSurrogate", "int,int", "16", "67108862"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "-2"}}, 1), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"float"}, new String[]{"-3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:4>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:9>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "double", "-1.7976931348623155E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"Can not "}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getStaxWriter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "double", "-Infinity"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "-9223372036854775703"}}), new String[][]{{"writeSpace", "char[],int,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "double[],int,int", "<sample:2>", "92", "239"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "char", "n"}}, 2), new String[][]{{"useDefaultPrettyPrinter", "", "2"}, {"writeArray", "double[],int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", "int,int", "-1073741837", "-2147483648"}}, 2), new String[][]{{"writeArray", "int[],int,int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=-2147483645, getHighestEscapedChar=0...#239#-2040668344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=-2147483645, getHighestEscapedChar=0...#239#-2040668344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "writeRaR", "-1", "86"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0xFFFFFFFF"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "1.123F5678901234567"}}), new String[][]{{"startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:8>", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "-3.7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", ",u expecting field n", "67108862", "-16777216"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#228#-973972857", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-268", "-33554175"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:9>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:2>", "<sample:3>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", ""}}), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"int"}, new String[]{"-39"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<sample:9>"}}), new String[][]{{"writeBinary", "byte[],int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:0>"}}), new String[][]{{"writeBoolean", "boolean", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:6>", "<sample:3>", "1048668"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", "javax.xml.namespace.QName", "<sample:2>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1048668", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", "java.lang.String", "1.1234567890123456"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-1.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-9223372036854775808"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<null>", "10", "2147483558"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", new String[]{"javax.xml.namespace.QName"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNull", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=1, getHighestEscapedChar=0,...#238#-1818475810", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=1, getHighestEscapedChar=0,...#238#-1818475810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"0.1"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"TitleeHello, World", "0.6499999999999999"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"-67108862"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:6>"}}, 1), new String[][]{{"useDefaultPrettyPrinter", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-67108862, getFormatFeatures=7, getHighestEscapedChar=0, ...#237#-635680785", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-67108862, getFormatFeatures=7, getHighestEscapedChar=0, ...#237#-635680785", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "4325386", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "0.431"}}, 1), new String[][]{{"setNextNameIfMissing", "javax.xml.namespace.QName", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:kdyy>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-4194264"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canOmitFields", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"float"}, new String[]{"-0.0"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNull", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<empty>", "34", "-1073741824"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "-8388618", "-2"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.lang.String", "1.12345678901234567"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getStaxWriter", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideStdFeatures", "int,int", "-4202506", "67108862"}}, 2), new String[][]{{"writeSpace", "char[],int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-67108862"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "long[],int,int", "<null>", "-1073741824", "33554431"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}, 2), new String[][]{{"setNextNameIfMissing", "javax.xml.namespace.QName", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", "java.lang.String", "Titke"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"(("}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.25", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"123456,78u9012345678901234567890"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigDecimal", "0.1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "-4194380", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"1073741824", "524278"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:1>", "<sample:1>", "-4194314"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"short"}, new String[]{"-32768"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", new String[]{"javax.xml.namespace.QName"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "char[],int,int", "<sample:2>", "134217722", "56"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "67108861", "1"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeOmittedField", "java.lang.String", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "56", "4194275"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"00", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", "java.lang.Object", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"-5", "536870871"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=536870867, getHighestEscapedChar=0, ...#237#-44209329", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=536870867, getHighestEscapedChar=0, ...#237#-44209329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", "int,int", "2147483610", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=2147483610, getHighestEscapedChar=0,...#238#-362435963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:6>", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=1, getTypeDesc=ROOT, hasCurrentIndex=true, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"char"}, new String[]{"A"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-2147483648"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldId", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"/a/b", "Infinity"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getDupDetector", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.DupDetector", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRepeatedFieldName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:7>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"char"}, new String[]{"a"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_checkStdFeatureChanges", "int,int", "5", "1073741824"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", "suart an array", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "-4194304"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", "int", "128"}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=128, getFormatFeatures=1, getHighestEscapedChar=0, getOut...#231#1339309819", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=128, getFormatFeatures=1, getHighestEscapedChar=0, getOut...#231#1339309819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_throwInternal", ""}}, 2), new String[][]{{"enable", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:4>", "<sample:2>", "2147483647", "16777236"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteTypeId", ""}}, 2), new String[][]{{"writeStartDocument", "java.lang.String", "3"}, {"writeComment", "java.lang.String", "0"}, {"getPrefix", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"float"}, new String[]{"4.9"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:-22>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", "java.lang.Object", "<s:k>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"st", "0.31"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<empty>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeId", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1073741824", "-10"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"short"}, new String[]{"-32768"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:2>", "262143", "22"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getStaxWriter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", ""}});
  assertNotNull(actual);
  assertEquals("org.codehaus.stax2.ri.Stax2WriterAdapter", actual.getClass().getName());
  assertEquals("{getEncoding=null}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteBinaryNatively", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", new String[]{"java.lang.String", "byte[]"}, new String[]{"", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"vnnown", "10"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"<a?b</a>", "1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#1413424036", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#1413424036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:2>", "2147483610", "67108862"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<sample:3>", "2147483647", "1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"H"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleEndObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", "0x1F0x1F", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:11>", "<null>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnimplementedStax2", new String[]{"java.lang.String"}, new String[]{"wriseRaw"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", "java.lang.String,boolean", "-y.0", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#237#-1111517974", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:16>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{".5"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<sample:2>", "-2147483648", "-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"4194314", "-5"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=4194314, getHighestEscapedChar=0, ge...#235#-1030960979", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=4194314, getHighestEscapedChar=0, ge...#235#-1030960979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "4194349"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:3>", "false"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-37"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:4>", "<sample:0>", "-4194314", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", "byte[],int,int", "<null>", "4194314", "-8388618"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}}), new String[][]{{"flush", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "checkNextIsUnwrapped", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-16777236"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteTypeId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<i:-32>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_asString", new String[]{"java.math.BigDecimal"}, new String[]{"1E+100"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1E+100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteTypeId", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"1014", "2", "8388618"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, hasCurrentIndex=false, hasCurrentName=false, hasPathSegment=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483648", "4194314"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:4>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutpu...#228#-621382680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:0>", "<sample:2>", "-1610612736"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRepeatedFieldName", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canOmitFields", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, false, 2, new String[][]{}), new String[][]{{"setNextIsAttribute", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=10, getHighestEscapedChar=0...#239#-345219430", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=10, getHighestEscapedChar=0...#239#-345219430", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"float"}, new String[]{"1.7014117E38"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"1073741888", "1"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String", "("}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#-1853512864", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#-1853512864", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"12:30R45WRITE_XML_1_1"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", "java.lang.String,boolean", "write String nvalue", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", " bytes (out of ", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"12"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:5>"}, false, 2, new String[][]{}), new String[][]{{"writeBinary", "java.io.InputStream,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"67108926", "-5"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:1>"}, false), new String[][]{{"initGenerator", "", "7"}, {"getPrettyPrinter", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#1413424036", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:keyy>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:0>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "float", "-1.7014117E38"}}), new String[][]{{"overrideStdFeatures", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_handleStartObject", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"short"}, new String[]{"0"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteBinaryNatively", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"0010", "-1073741824", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"write boolean value"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<sample:3>", "-12"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1.51.0", "<i:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.lang.String", "1.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#228#1759162023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"2020-02-30T25:61:61", "-2"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<empty>", "-1", "-2"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_reportError", "java.lang.String", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}), new String[][]{{"isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "1"}, {"writeBinaryField", "java.lang.String,byte[]", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"long"}, new String[]{"9223372036854775807"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputBuffered", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", "Sitle", "-4194347", "-8405012"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:2>", "8405012", "2147483611"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", "java.lang.String", "umknown"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#228#-62927897", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", new String[]{"javax.xml.namespace.QName"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"vrite String valueCan not "}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "short", "-32768"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "char[],int,int", "<sample:0>", "-8142868", "-4096"}}), new String[][]{{"writeBoolean", "boolean", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:3>", "2147483647", "28"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"write null vblud"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}), new String[][]{{"setCodec", "com.fasterxml.jackson.core.ObjectCodec", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"write number"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<null>", "<sample:1>", "-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"1.25"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"<a>a</a>", "4194372", "4194347"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"4194314"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[]", "<empty>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"UTF-8", "WRITE_XML_1_1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=5, getHighestEscapedChar=0, getOutpu...#229#105061922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "int", "-1140850663"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "37748775", "-16404"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getHighestEscapedChar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "9223372036854775807"}}), new String[][]{{"startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldId", new String[]{"long"}, new String[]{"-9223354444668731328"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "char[],int,int", "<sample:2>", "0", "-8388628"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.9.8 {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=9, getPatchLevel=8, isSnapshot=false, isUknownVersion=false, isUnknownVersion=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:3>"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEmbeddedObject", new String[]{"java.lang.Object"}, new String[]{"<s:keLy>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", "int,int", "-33554431", "2147483647"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "java.lang.String,int,int", "Si", "-2147483648", "8388628"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c010"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "32", "-4194314"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", "boolean", "true"}}), new String[][]{{"writeBinary", "java.io.InputStream,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 5, new String[][]{}), new String[][]{{"disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#-1199331807", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#-1199331807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:3>", "5", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideStdFeatures", "int,int", "-67108861", "-8388694"}}), new String[][]{{"canOmitFields", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=3, getHighestEscapedChar=0,...#238#790311648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsCData", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"char"}, new String[]{"f"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", "java.lang.Object", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", "java.lang.String,boolean", "0x23456789", "false"}}), new String[][]{{"getCodec", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-2101253"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setFeatureMask", "int", "67108862"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"<a>b</a>1e10"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObjectRef", "java.lang.Object", "<i:43>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"-1", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBooleanField", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFLFFFF", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"65011691"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "int[],int,int", "<empty>", "2147483647", "-33488894"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", new String[]{"java.io.Reader", "int"}, new String[]{"<sample:0>", "2147483647"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "version", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483583, getFormatFeatures=2, getHighestEscapedChar=0,...#238#580378248", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483583, getFormatFeatures=2, getHighestEscapedChar=0,...#238#580378248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"64", "-35"}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setHighestNonEscapedChar", "int", "-8405012"}}), new String[][]{{"setCurrentValue", "java.lang.Object", "2"}, {"getFeatureMask", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=98, getHighestEscapedChar=0, getOutp...#230#-1731880809", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"a bb", "3.4028235E38"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<s:bC>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{".5"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:5>", "-2147483648", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:0>"}, false), new String[][]{{"isClosed", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", new String[]{"javax.xml.namespace.QName", "javax.xml.namespace.QName"}, new String[]{"<sample:4>", "<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinaryField", "java.lang.String,byte[]", "wr", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("{\"wr\"} {getCurrentIndex=0, getCurrentName=wr, getEntryCount=1, getTypeDesc=OBJECT, hasCurrentIndex=true, hasCurrentName=true, hasPathSegment=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"double"}, new String[]{"-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", new String[]{"int"}, new String[]{"-33554417"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextNameIfMissing", "javax.xml.namespace.QName", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "flush", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "configure", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature,boolean", "<sample:1>", "false"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "false"}}), new String[][]{{"writeValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "handleMissingName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeObject", "java.lang.Object", "<s:aa>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCurrentValue", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsUnwrapped", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", "double[],int,int", "<sample:2>", "125", "4194394"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCodec", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.math.BigInteger", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "inRoot", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<null>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", new String[]{"java.lang.String"}, new String[]{"aaabaaaaaaaaaaaaaaaaaaaaaaaaa"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"TI9LE"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "initGenerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRepeatedFieldName", ""}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeFieldName", "java.lang.String", "<null>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<sample:0>", "-1", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"wriwe null v-alue", "1.0"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "startWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "long", "0"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextIsAttribute", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartArray", "int", "-8405012"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:3>", "64", "-68157422"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypePrefix", new String[]{"com.fasterxml.jackson.core.type.WritableTypeId"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=3, getHighestEscapedChar=0, getOutpu...#229#-545150750", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-27167167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#228#1498904519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "16411", "2147483647"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=2147483647, getHighestEscapedChar=0,...#238#2144422308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumber", "java.lang.String", "WRITE_XML_1_1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=4, getHighestEscapedChar=0, getOutpu...#229#1927439234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<sample:0>", "2147483610", "-5"}, false, 4, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRepeatedFieldName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "setNextName", new String[]{"javax.xml.namespace.QName"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:4>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=6, getHighestEscapedChar=0, getOutpu...#229#-1717315390", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"257", "125", "-16777236"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNullField", "java.lang.String", "1E-51e10writeRaw"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isClosed", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "finishWrappedValue", "javax.xml.namespace.QName,javax.xml.namespace.QName", "<sample:10>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.util.DefaultXmlPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=2, getHighestEscapedChar=0,...#238#-514082081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "enable", new String[]{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=7, getHighestEscapedChar=0, getOutpu...#229#755274594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator$Feature", "<sample:5>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeNumberField", "java.lang.String,long", ")0xFFFFFFFF", "9223372036854775807"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeStartObject", "java.lang.Object", "<s:ke>"}, {"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeRawValue", "java.lang.String,int,int", "write number", "20", "4032"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeTypeSuffix", new String[]{"com.fasterxml.jackson.core.type.WritableTypeId"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator", "writeBinary", "byte[],int,int", "<sample:3>", "1", "2147483647"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.type.WritableTypeId", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=true, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=1, getHighestEscapedChar=0, getOutpu...#229#-1195363422", SearchInputFactory_scaffolding.receiverState());
 }
}
