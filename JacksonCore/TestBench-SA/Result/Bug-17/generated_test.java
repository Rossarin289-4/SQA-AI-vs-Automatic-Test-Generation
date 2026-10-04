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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "1", "57344"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "93"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "28650"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<null>", "56319", "57342"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "93"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "122"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<null>", "56319", "57342"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "93"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Gwritwrnte a null", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:1>", "7146", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<sample:1>", "7146", "10"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1131644446", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"91"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Fjwrite a binary value", "<b:true>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "55295", "55297"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "11v-30:45", "10240.2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"I"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "long", "9223372036854775807"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#776242969", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"i", "\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "65535"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"513"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"stas ao oajfct--1"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "5.", "1024.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#238448982", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"45", "-1073852418"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}), new String[][]{{"writeNumber", "short", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"45", "-1073852418"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}}), new String[][]{{"writeNumber", "short", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=45, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-497114667", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=45, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-497114667", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "26", "250"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "573y43", "116", "1073741858"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "114"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"write ool8an\036vb+lue7", "<s:n>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1682549850", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E-5", "<i:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "28671"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\t", "<i:-67108858>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "14319"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"4", "<s:. 50\n9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndObject", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "14319"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-770873222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "float", "Infinity"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\t\t", "<s:9>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:2>", "-91", "-2147483341"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-373429866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\t\tu", "<s:88>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "91", "-2147483341"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#1466637438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideFormatFeatures", "int,int", "117", "57301"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "NaN"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<empty>", "7146", "1074790411"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#1945301410", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "<null>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#602875868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "92"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#229#749698702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "36028796951827014"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:6>", "<sample:1>", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#1810794043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:6>", "<sample:10>", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<empty>", "2147483647", "2147483634"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#66170464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:5>", "<sample:2>", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "-1", "1073741785"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#239#-631659429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "char[],int,int", "<sample:0>", "511", "28671"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-783963349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:5>", "<sample:2>", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:2>", "-45", "114709"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#1810794043", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"57", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "char[],int,int", "<sample:0>", "57344", "2147479551"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "118"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5d", "225276"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "char[],int,int", "<null>", "57342", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"{\"a#:1a}", "28671.5"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "117", "-1073852418", "270"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_outputSurrogates", "int,int", "90", "57342"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#792187257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"3", "-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"<1.5C"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<sample:0>", "116", "55296"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:1>", "<sample:0>", "<sample:0>", "56299"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "57343"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("56299", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#1927392724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:4>", "<null>", "<null>", "-110721"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[],int,int", "<sample:1>", "2147483647", "-110721"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,double", "5s.1.5g", "512.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "Fjwrite a binary value", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"56319"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:5>", "<sample:3>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "1.12345678901234567", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "-118", "122"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1929398758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"-1.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "92"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:. 50\n9>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<s:. 09>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1524579621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"679.9989999999999"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "int[],int,int", "<sample:0>", "90", "-536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-1360.7579999999996"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "1"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:6>", "<null>", "270", "1073741792"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "int[],int,int", "<sample:0>", "90", "-1073852418"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"464.4"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "2"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:0>", "67108865"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "int[],int,int", "<sample:0>", "90", "-1073852385"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1732375655", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-1222.1000000000001"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<sample:2>", "56320"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "2"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:0>", "67108925"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-10878.713999999996"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:3>", "56221"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "67108931"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1249988703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:12>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "write a boolean value", "56319"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-967896325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", "I"}}, 1), new String[][]{{"canWriteBinaryNatively", "", "7"}, {"writeNullField", "java.lang.String", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"float"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<null>", "<sample:2>", "<sample:0>", "-2146959315"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "2147483647"}}, 1), new String[][]{{"writeBinary", "byte[]", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"", "2038.1"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"\uffff"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"char"}, new String[]{"\u00e9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", "\t\tu", "2147483647"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", ";\tFTitle", "-536870912"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<i:-11>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", ":\tG_Titl010", "268435460"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}}), new String[][]{{"canWriteBinaryNatively", "", "1"}, {"writeEndObject", "", "3"}, {"writeBinary", "byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:1>", "56319", "-2147483634"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<null>", "7146", "56320"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{",\037expecting \"jeld name", "65534"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-2062373608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}}, 2), new String[][]{{"writeEndArray", "com.fasterxml.jackson.core.JsonGenerator,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "char[],int,int", "<null>", "14325", "65535"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", new String[]{"java.lang.String"}, new String[]{"P"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:1>", "2147479492", "67108925"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2016359478", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String,int,int", "2020-02-30T25:61:61", "1073741785", "125"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:.\037/9>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,long", ".5", "23"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1169178144", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyPrettyValueWrite", "java.lang.String,int", "1.5", "92"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "56319", "56319", "124"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "56319", "56319", "124"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", "Title"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "122", "57301"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<null>", "56319", "57342"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "93"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "122", "57301"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<null>", "56319", "57342"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "93"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "49", "14325"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "0x1F"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyPrettyValueWrite", new String[]{"java.lang.String", "int"}, new String[]{"null", "123"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", "java.lang.Object", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E/565535", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E/565535", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"I", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"H", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"G", "<b:true>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "-33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"G", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "-33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"G", "<b:true>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "-33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1167679934", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Gwrite a null", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "-33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#862500260", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Gwrite b nupll", "<b:false>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "7146", "-33"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-134572093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1", "<s:wlbD\r>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:3>", "-1073734599", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "112:30:45", "44"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1", "<s:wlbD\r>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:3>", "-1073734599", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "112:30:45", "44"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1", "<s:wlbD\r>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:3>", "-1073734599", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "112:30:45", "44"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String", "-1.5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"[1,2]", "<sample:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "55298", "536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1789259610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"[1,,2]", "<i:2>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "55298", "536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1943337012", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"[1,D2]0", "<i:86>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "55298", "-536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "1073741858"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-511562980", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"[1,D2]0", "<s:wlbD\r>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "55298", "-536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "1073741858"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2095937494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"[1,D2]0", "<s:wlbD\r>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "1073741858"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#792187257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"hXt", "<s:wbD\rB>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "-110721", "-536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:2>", "1073741858"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1789259610", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"hXtp://e", "<s:ubD\r>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:2>", "33", "-536926209"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "1074790411"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2095937494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5d300", "<d:15.0>"}}, 2), new String[][]{{"copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", ")", "57344"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", ")", "57344"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", ")", "57344"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,int", ")9", "57360"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1050018046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1038634658", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1993205588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 3), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"164"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<d:1.491>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"82"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<d:1.491>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "58", "92"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", "int,int", "65535", "126"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "1"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:1>", "<null>", "123", "48"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#238#214365752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-783963349", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1092519469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "l"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<s:pa>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-2147483648"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1019287125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "2147483647", "-2146959315"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#2089986694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147479551", "-2146959315"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-1514586133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"11v:30:45", "56320"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteTypeId", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "26", "250"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "573y43", "116", "1073741858"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "114"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "91", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1706972131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "91", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<s:. 09>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "byte[]", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1823537125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"write ool8an\036vb+lue7", "<i:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "57342"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1528472448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportError", new String[]{"java.lang.String"}, new String[]{"write a string"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", "int,int", "55297", "117"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"0\r0wqiite a string1.1234567890123456", "<s:1t0r`D\rq>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "-126", "250"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1121973727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"\t\t", "<s:88>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "91", "-2147483341"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#1927392724", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "float", "93"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "float", "93"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-932356158", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-932356158", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", "java.lang.Object", "<i:-1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "27"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:2>", "<sample:1>", "35", "34"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"1.12345678", "48"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:1>", "48", "48"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1284244928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"http://example.com/a?b=c", "48"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:1>", "48", "48"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", "int,int", "57344", "512"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1822038915", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"http://example.com/a?b=c", "48"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:1>", "48", "48"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", "int,int", "57344", "512"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", "a b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#324706273", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"http://example.com/a?b=c", "-48.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:1>", "48", "48"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", "int,int", "57344", "512"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2012173095", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"http://example.com/a?b=c", "-48.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:1>", "48", "48"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String", "\t\tu"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", "int,int", "57344", "512"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1321778626", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<i:-67108858>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "91"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"<a>b</a>", "1", "55297"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"<a>b</a>", "67108865", "55297"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<null>", "57342"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<null>", "57342"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<null>", "<null>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<null>", "57342"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<null>", "<null>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<empty>", "2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<null>", "<null>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<empty>", "2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<null>", "<null>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<sample:2>", "2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<sample:0>", "<null>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<sample:2>", "2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<sample:0>", "<null>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<sample:3>", "2147483647"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<sample:0>", "<null>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<empty>", "2147483647"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:6>", "<sample:0>", "<null>", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCharacterEscapes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", new String[]{"int", "int"}, new String[]{"2147483647", "93"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "56319", "56319", "124"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", "Title"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "2", "57344"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "93"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "-2147483646", "14325"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<null>", "56319", "57342"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "l"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "14325"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", ","}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "93"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "-2147483648", "14325"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", ","}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "993"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "49", "14325"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", "java.lang.String", "0x1F"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", "int,int", "56318", "49"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=48, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-136551972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "67108865", "7146"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "java.lang.String", "0xFFFFFFFF"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "67108865", "7146"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E-5", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "-2147483648", "124"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E-5", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E,55", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E/565535", "<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1706972131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E/565535", "<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"93"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"1E/565535", "<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"GwritwIrnte a null", "<s:b>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:1>", "7146", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<sample:1>", "7146", "10"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-2128716799", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Gwrit", "<s:xlb>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<null>", "-1073734678", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char[],int,int", "<sample:1>", "7098", "10"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "abc", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:wlbD\r>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "\000"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:3>", "-1073734599", "-33"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"", "<s:wlbD\r>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:3>", "-1073734599", "-33"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "12:30:45", "44"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", new String[]{"java.lang.String"}, new String[]{"write a string"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"<a>b</a>", "35"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"/5_333", "<s:. 09>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:0>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "11v:30:45", "4.4044"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"F", "<d:1.491>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<empty>", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-664163462", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"55296"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", new String[]{"java.lang.String", "java.lang.Object"}, new String[]{"Fjwrite a binary value", "<b:false>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-2147483648"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "11v-30:45", "1024.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"92"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyPrettyValueWrite", new String[]{"java.lang.String", "int"}, new String[]{"1.5f", "57342"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{"int"}, new String[]{"56320"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "2147483647", "124"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "H"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "java.lang.String", "57343"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1092519469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1832359717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"a,b,c", "117"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"a,b,c", "124.956"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1706972131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#574345796", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#574345796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:15.0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-422726557", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-422726557", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:15.0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:15.0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#1654306383", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#1654306383", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1349060027", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1349060027", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:15.0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1676566967", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1676566967", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "1.5e300", "<d:15.0>"}}), new String[][]{{"copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#238#214365752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1993205588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2120359775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1092519469", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1832359717", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "010", "4.4044"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"49", "44"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:. 09>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:ubD\r>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:u>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:D4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false), new String[][]{{"copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"kt", "\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "32767.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1284244928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"kAt", "\u00e9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "32767.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2013650015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"kAt", "\u00e90"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "32762.2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1016577662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", new String[]{"java.lang.String", "java.lang.String"}, new String[]{"kAt", "\u00e90"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "java.lang.String", "Hello, World"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "91"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1822038915", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1284244928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"82"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"82"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<d:1.491>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"164"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<d:1.491>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"164"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "55296", "56320"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "12:30:45", "write a boolean value"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#838077979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "55296", "56320"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "12:30:45", "write  boolean value"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1835150332", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "-55296", "56320"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "12:30:45", "write  boolean value"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-313071776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"java.lang.String"}, new String[]{"Hello, Wo5qld"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_decodeSurrogate", "int,int", "-55296", "56320"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "12:30:45", "write  boolean value"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1310144129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"l", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:1>", "<empty>", "123", "48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "1"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:1>", "<empty>", "123", "48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "1"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:1>", "<empty>", "123", "48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeTypeId", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"55295", "65536"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#479558573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#637448776", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputBuffered", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1781035702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:3>", "<empty>", "45", "10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:1>", "<null>", "-45", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:0>", "<null>", "45", "-22"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:4>", "<sample:1>", "45", "131050"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>", "513"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "93"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"511"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>", "513"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("507", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:7>", "<sample:3>", "<sample:2>", "571"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", "int", "93"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("565", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "1E/565535"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "l"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "lHello, World"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCurrentValue", "java.lang.Object", "<s:-pa>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-287172575", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "1073741858", "126"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<empty>", "1073741858", "-126"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-126"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-126"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-126"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-210835896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:2>", "2147483647", "-126"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigDecimal", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1019287125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{")"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "float", "34"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-210835896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"5."}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#786236457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#1620714840", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"55296", "49"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"55296", "49"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}), new String[][]{{"canWriteBinaryNatively", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"45", "95"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}), new String[][]{{"canWriteBinaryNatively", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=13, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#229#81134059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"45", "190"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}), new String[][]{{"canWriteBinaryNatively", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=44, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#229#1956292813", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"45", "-1073852418"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}}), new String[][]{{"writeNumber", "short", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "33", "45"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "57343", "116", "123"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "57"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "26", "250"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String,int,int", "573y43", "116", "1073741858"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.util.DefaultPrettyPrinter", actual.getClass().getName());
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
}
