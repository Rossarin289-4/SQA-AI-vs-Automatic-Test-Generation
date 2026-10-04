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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:9>", "<sample:0>", "-2147483648"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char", "a"}, {"com.fasterxml.jackson.core.JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1881164192", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNullField", "java.lang.String", "12:30:45"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "{\"a\":1}", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:3>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{"/a/b"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:1>", "-22"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<sample:1>", "-2147483647", "-2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1386469917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:1>", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1530358372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<empty>", "1073741805", "-2147483648"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:key>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "123456789012345678901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1213009734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_verifyOffsets", new String[]{"int", "int", "int"}, new String[]{"-1073741805", "2147483610", "-22"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCurrentValue", "java.lang.Object", "<i:3>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<null>", "-22", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<null>", "2147483610", "-11"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#35287040", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#35287040", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"5"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:5>", "true"}}, 1), new String[][]{{"useDefaultPrettyPrinter", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-526262908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-526262908", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "9", "-1", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"159ee){\"a\":1}", "-4.1"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<sample:2>", "5", "1073741823"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,int", "2147483648", "10"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "1073741805"}}, 2), new String[][]{{"writeBinary", "byte[],int,int", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-784536257", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-784536257", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"1.W1334567885.", "NaN"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "2020-01-01", "1", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<null>", "-22", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"0x1F", "67108864"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<s:AE>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-463786334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeEmbeddedObject", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "a", "0RXITE_NUMBERSAS_STRINGS[1,2]Hello, orld"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#661355902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:2>", "0", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1149291718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getSchema", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "Ix1F", "1E+100"}, {"com.fasterxml.jackson.core.JsonGenerator", "getFeatureMask", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#-183058993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "12345678901234567", "<sample:0>"}, {"com.fasterxml.jackson.core.JsonGenerator", "getHighestEscapedChar", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#1723408635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectRef", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "FLUSH_PASSED_TO_STREAM", ")"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeEndArray", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:6>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "Hello, World", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArrayFieldStart", "java.lang.String", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#-183058993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:0>", "2147483630", "20"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<sample:7>"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "13", "5"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObject", "java.lang.Object", "<s:NQ>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-651802725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-536870912", "1"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteObjectId", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "true", "<i:-1>"}}, 2), new String[][]{{"writeArray", "int[],int,int", "1"}, {"isClosed", "", "5"}, {"writeNumber", "java.lang.String", "3"}, {"writeBinary", "java.io.InputStream,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportUnsupportedOperation", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:1>", "<sample:0>", "268435416"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:9>", "<sample:0>", "-2147483648"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char", "a"}, {"com.fasterxml.jackson.core.JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#1551045457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:9>", "<sample:0>", "2147483647"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char", "a"}, {"com.fasterxml.jackson.core.JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<null>", "<sample:0>", "2147483647"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char", "a"}, {"com.fasterxml.jackson.core.JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:4>", "<empty>", "-34"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#38591744", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:5>", "<null>", "-1"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "float", "0.0"}, {"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "10", "10", "10"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483647", "-22"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "10", "-2147483648", "1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-2147483648", "-37"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<sample:4>"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "-37"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<sample:4>"}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteTypeId", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"IGNORE_UNKNOWN", "-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "-2147483648", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "1.5e300"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:2>", "<sample:2>", "-1", "-2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:0>", "<sample:2>", "-1", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "PT1H"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:4>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "1.25"}, {"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "[1,2]"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.core.JsonGenerator", "getCodec", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentStructure", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:9>", "<sample:2>", "10", "-2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "2147483647", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.55d<a>b</a>"}}, 1), new String[][]{{"getFormatFeatures", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#300996905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "2147483647", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.55d<a>b</a>"}}, 1), new String[][]{{"getFormatFeatures", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "58"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNullField", "java.lang.String", "1E-5"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String", "123456789012345678901234567890"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"1.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"47.62"}, false, 10, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"47.62"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#660722051", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#354044167", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0.08"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1657794404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"0.08"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "null array", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#44716352", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"IGNORF_UNKNJWN0x1F"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeString", "java.lang.String", "5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1041788705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<d:7.5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1151530872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<s:8>"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<d:3.0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputBuffered", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputBuffered", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeTree", new String[]{"com.fasterxml.jackson.core.TreeNode"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "-2147483640", "-67108775"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"QUOTE_FIELD_NAMES", "35", "-1073741805"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", " 12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"QUOTD_FIELD_NAMES", "-2147483648", "-1073741805"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "0x1F", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", " 12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"QUOTD_FIELD_NAMES", "-2147483648", "-1073741805"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "0x1F", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", " 12:30:45"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"4.1"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"PU1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<i:-30>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#607674789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}}, 3), new String[][]{{"writeNull", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1594076388", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1594076388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1594076388", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1594076388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1703818555", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#586333281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2021167193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:NPt>"}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<null>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "0x223456789"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:W>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<null>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "0x223456789"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.math.BigInteger", "9223372036854775808"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#258#-1380634140", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<null>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "0x223456789"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.math.BigInteger", "9223372036854775808"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1821487297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<null>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "0x22345678"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.math.BigInteger", "9223372036854775808"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1476407646", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<null>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "0x22345678"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<null>", "0", "-2147483648"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "0", "-1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "java.lang.String", "0x22345678"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#258#-1153270397", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartArray", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483648"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:i5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "_reportUnsupportedOperation", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#961275327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483648"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:Ri5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "_reportUnsupportedOperation", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-35797026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<null>", "2147483610", "-2147483623"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:Ri5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<null>", "2147483610", "-2147483623"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:Ri5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "2147483610", "2147483647"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:Ri5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "IGNORE_UNKNOWN", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-35797026", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "2147483610", "2147483647"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:Ri5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "IGNORE_UNKNOWN", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#1649019865", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "2147483632", "2147483643"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:ui5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "IGNORE_UNKNOWN", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1648875078", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "0", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#300996905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"549755813889"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1540587937", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "1.5", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"6"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBooleanField", "java.lang.String,boolean", "1.5", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "getSchema", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-0.0", "10", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "version", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-e/.0", "2147483647", "-28"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-e/'.0", "2147483647", "10"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1530358372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-e'.02020-02-30T25:61:61", "-2147483647", "10"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-84237218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"1.5", "-2147483647", "20"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<null>", "2147483647", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<empty>", "2147483647", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#2146364071", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<empty>", "2147483647", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<empty>", "2147483647", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2010496439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "int[],int,int", "<empty>", "2147483647", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#533286019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_throwInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "overrideFormatFeatures", "int,int", "10", "-1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "TITLE", "0", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<sample:1>", "0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<sample:1>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:3>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1604747142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:6>", "<sample:1>", "0"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:3>", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "12:30:45"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1351116520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:6>", "<sample:1>", "0"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:3>", "<sample:3>", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:2>", "<sample:1>", "-40"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeEndObject", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeString", "java.lang.String", "ESCAPE_NON_ASCII"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeEndObject", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeString", "java.lang.String", "ESCAPE_NON_ASCIIAUTO_CLOSE_TARGET"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "2147483647", "10"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483647", "-22"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "10", "-2147483648", "1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "-2147483647", "-22"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "10", "-2147483648", "1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", "int", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<empty>", "-1073741847", "-37"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFormatFeatures", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#-183058993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:9>", "<null>", "0", "-22"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:9>", "<sample:1>", "-2147483648", "-22"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"IGNORE_UNKNOWN", "-1.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteFormattedNumbers", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "float"}, new String[]{"IGNORE_UNKNOWN", "-1.0"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteFormattedNumbers", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "_reportUnsupportedOperation", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:2>", "<sample:2>", "-1", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeFieldName", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:4>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "1.25"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getSchema", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNullField", "java.lang.String", "12:30:45"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:7>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeStartObject", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1151530872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.5d"}}), new String[][]{{"disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNull", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.5d"}}), new String[][]{{"canWriteObjectId", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.5d"}}), new String[][]{{"getFormatFeatures", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "-1", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "setCurrentValue", "java.lang.Object", "<i:0>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.5d"}}), new String[][]{{"getFormatFeatures", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:9>", "<sample:2>", "10", "-2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "char[],int,int", "<sample:0>", "2147483647", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeFieldName", "java.lang.String", "1.55d<a>b</a>"}}), new String[][]{{"getFormatFeatures", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#300996905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeEndObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "byte[],int,int", "<sample:2>", "10", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-1", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "-2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRaw", new String[]{"char[]", "int", "int"}, new String[]{"<sample:1>", "-2147483648", "58"}, false, 9, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCurrentValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.JsonGenerator", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#257#-9473986", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"61"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"244.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"2.381"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeStartObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"IGNORF_UNKNJWN0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeString", "java.lang.String", "5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"IGNORF_UNKNJWN0x1F"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeString", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNullField", new String[]{"java.lang.String"}, new String[]{"IGNORF_UNKNJWN0x1F"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeString", "java.lang.String", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1041788705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getHighestEscapedChar", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1151530872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:2>", "10", "-2147483648"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getSchema", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_writeSimpleObject", "java.lang.Object", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "version", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "setHighestNonEscapedChar", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.8.3-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=8, getPatchLevel=3, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#1786217638", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputBuffered", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1657794404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#724440067", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNull", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775808"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-390915102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#739871523", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getCurrentValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"a,b,c"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#533286019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"a,,c"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1530358372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"a,,"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"IGNORE_UNKNOWN"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1233910053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"b,,"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"java.lang.String"}, new String[]{"b"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEmbeddedObject", "java.lang.Object", "<b:true>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<null>", "-2147483647", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "86"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1213009734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:4>", "2147483647", "86"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndObject", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:Q>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:NQ>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:NQ>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "10", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#533286019", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:NQ4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "10", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-463786334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeObject", new String[]{"java.lang.Object"}, new String[]{"<s:N4>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "canWriteBinaryNatively", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "10", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"QUOTE_FIELD_NAMES", "-22", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"QUOTD_FIELD_NAMES", "-2147483648", "-1073741805"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "0x1F", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"QTOTD_FIELD_N@MES1.5f", "2147483647", "2147483647"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "canWriteFormattedNumbers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_verifyOffsets", "int,int,int", "10", "-22", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#124581108", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#124581108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#124581108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "enable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeEndArray", ""}}), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getMat...#247#-1575442194", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:3>", "-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"\n"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"\nPT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-770464218", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#607674789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<i:-30>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#73592544", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1594076388", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1594076388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "false"}}), new String[][]{{"writeNull", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}}), new String[][]{{"writeNull", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1249043903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<null>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#912835135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getFeatureMask", new String[]{}, new String[]{}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setCurrentValue", new String[]{"java.lang.Object"}, new String[]{"<s:NP>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483648"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeTypeId", "java.lang.Object", "<s:i>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#961275327", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1L", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1L", "-1"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1L", "-8193"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "null array"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-651802725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1", "8193"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "null array"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#345269628", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"1", "8193"}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"274877906944"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1540587937", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#69840184", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"18446744073709551616"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-390915102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-36893488147419103232"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1387987455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "1073741805", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=...#256#-1549715201", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=...#256#-1549715201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "1073741805", "10"}}), new String[][]{{"getFilterContext", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.TokenFilterContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT, isStartHandled=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=...#256#-1549715201", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"2147483626"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "1073741770", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483626, getFormatFeatures=0, getHighestEscapedChar=1...#257#2142331552", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483626, getFormatFeatures=0, getHighestEscapedChar=1...#257#2142331552", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"2143289322"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "1073741770", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2143289322, getFormatFeatures=0, getHighestEscapedChar=1...#257#1321854159", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2143289322, getFormatFeatures=0, getHighestEscapedChar=1...#257#1321854159", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"1071644661"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "1073741770", "10"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1071644661, getFormatFeatures=0, getHighestEscapedChar=1...#257#-728414791", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1071644661, getFormatFeatures=0, getHighestEscapedChar=1...#257#-728414791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setFeatureMask", new String[]{"int"}, new String[]{"1071644661"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "<sample:4>", "false"}, {"com.fasterxml.jackson.core.JsonGenerator", "overrideStdFeatures", "int,int", "1073741770", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<null>", "-22", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1693147801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<null>", "-22", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1386469917", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<null>", "-22", "1"}, {"com.fasterxml.jackson.core.JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"java.io.InputStream", "int"}, new String[]{"<sample:0>", "-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-781134972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1087812856", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#586333281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "32767"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "32767"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2010496439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputBuffered", new String[]{}, new String[]{}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String,int,int", "[1,2]", "-8193", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1077142102", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "short", "1"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String,int,int", "[1,2]", "-8193", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1298069258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeStartObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String,int,int", "[1,2]", "-8193", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=!NullPointerException, canWriteBinaryNatively=!NullPointerException, canWriteFormattedNumbers=false, canWriteObjectId=!NullPointerException, canWriteTypeId=!NullPointerException, getFea...#387#683993232", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "overrideFormatFeatures", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeFieldId", "long", "9223372036854775807"}, {"com.fasterxml.jackson.core.JsonGenerator", "setFeatureMask", "int", "2147483610"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#245#978292768", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#245#-1822762079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<null>"}, {"com.fasterxml.jackson.core.JsonGenerator", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#256#-2107977208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonGenerator", "close", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#256#-2107977208", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonGenerator", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#586333281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "2020-02-30T25:61:61", "-8193", "2147483610"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1351116520", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "java.lang.String,int,int", "2020-02-30T25:61:61", "-8193", "2147483610"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1963553862", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectRef", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2021167193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#257#-1339547263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getCharacterEscapes", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#586333281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputTarget", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputTarget", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "-1.5"}});
  assertNotNull(actual);
  assertEquals("java.io.StringWriter", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-154458519", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputTarget", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "-1.55."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputTarget", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "-1.55."}, {"com.fasterxml.jackson.core.JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.io.ByteArrayOutputStream", actual.getClass().getName());
  assertEquals(" {size=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#586333281", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "getOutputTarget", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "_reportError", "java.lang.String", "-1.55."}, {"com.fasterxml.jackson.core.JsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.io.StringWriter", actual.getClass().getName());
  assertEquals("", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2021167193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"QUOTD_FIELD_NAMES", "0.1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"QUPTD_FIELD_NAMES)", "-4.298"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1530358372", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"QUPTD_FIELD_NAMES)", "0.049"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1767536571", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<null>", "-2147483647", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<null>", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<null>", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#453556769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "-1073741805", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#364714921", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "-1073741805", "0"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1663657535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "1", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1406873665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "1", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1406873665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "-8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "1", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1287398504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "-63", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2010496439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "1", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-409801312", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "8193"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "1", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "isClosed", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:3>", "16386"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1900754272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "long", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-1693147801", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "long", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1604747142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "10"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "long", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#-1915322882", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:0>", "1073741805", "-2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:1>", "10"}, {"com.fasterxml.jackson.core.JsonGenerator", "writeNumber", "long", "-54"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#247#1382572061", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeObjectFieldStart", "java.lang.String", "IGMORE_UNKNOWN"}}), new String[][]{{"writeNumber", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRaw", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#226608135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}, 3), new String[][]{{"writeNullField", "java.lang.String", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawValue", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:7>"}}, 3), new String[][]{{"writeNullField", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1223680488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<empty>", "2147483647", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}}, 3), new String[][]{{"writeNullField", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#-2074214455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.JsonGenerator", "com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<empty>", "2147483647", "2147483647"}, {"com.fasterxml.jackson.core.JsonGenerator", "getFormatFeatures", ""}, {"com.fasterxml.jackson.core.JsonGenerator", "writeStartArray", ""}}, 3), new String[][]{{"writeNullField", "java.lang.String", "1"}, {"writeBooleanField", "java.lang.String,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1604747142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getMatc...#246#1604747142", SearchInputFactory_scaffolding.receiverState());
 }
}
