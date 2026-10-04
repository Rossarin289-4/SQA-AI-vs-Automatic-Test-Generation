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
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":1}", "-232", "59"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "write a null", "9998", "44"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "57343", "94"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1w.5", "87", "-2147483648"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "-1.5", "<s:r>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString,boolean", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:2>", "<sample:3>", "0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:7>", "<sample:3>", "-2143289343"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "_checkStdFeatureChanges", "int,int", "0", "60"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "write a string", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,int", "0x123456789", "-2147483648"}}), new String[][]{{"writeEndArray", "", "6"}, {"writeNumber", "long", "1"}, {"writeBoolean", "boolean", "2"}, {"setFeatureMask", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1498314531", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1498314531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]", "int", "int"}, new String[]{"<null>", "33", "-232"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeEndObject", ""}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "long", "55295"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\n"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "long", "124"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an object", "-55296", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-712609241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_decodeSurrogate", "int,int", "-1073741823", "57343"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:5>", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "double", "27648.0"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawUTF8String", "byte[],int,int", "<empty>", "1", "512"}}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-679494614", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-679494614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:7>", "true"}, false, 13, new String[][]{}), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"`nt", "write a boolean value"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.math.BigDecimal", "0.48"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setFeatureMask", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String,int,int", "write a null", "488", "56321"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeStartObject", "java.lang.Object", "<i:-2147483648>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,double", "abc", "17.0"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "java.lang.String", "1.4e300"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1706972131", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", new String[]{"java.lang.String"}, new String[]{"{\"a\":1~"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "long[],int,int", "<sample:2>", "-35", "118"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "short", "91"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-44908833", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeSimpleObject", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_verifyValueWrite", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getOutputTarget", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "java.lang.String,int,int", "0xFFFFFFFF", "55296", "117"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"HHlo, Wnorld1.5f56319"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBooleanField", "java.lang.String,boolean", "\013563+20", "true"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "short", "-32768"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "java.math.BigInteger", "57343"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"bUa, second!0x"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_verifyPrettyValueWrite", "java.lang.String", "-5"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "java.math.BigInteger", "1"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBooleanField", "java.lang.String,boolean", "\u00e9", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"qA1dd1:e\035dPr01"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:1>", "2147483647"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "short", "32767"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1677180103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "overrideFormatFeatures", "int,int", "31", "122"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", "java.lang.Object", "<s:s>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"512"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "int"}, new String[]{"eLp@HC1b2+e\035dTr0:520,2\u00e903p1U", "-35"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-672366080", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"IwpC0Bc+dU2p\u00e80Cr"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:4>", "<empty>", "-21"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1677180103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"-0/0wrThte a \ttring"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "double", "65536"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:9>", "-21"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1983857987", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeString", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "-2113929215", "-21"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideFormatFeatures", "int,int", "31", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectFieldStart", new String[]{"java.lang.String"}, new String[]{"y\007Y))7n53?"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "double", "-1.0"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:8>", "<sample:9>", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#1928005860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectId", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:0>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "writ0", "9999", "49"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"56319"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "\t", "<sample:1>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "flush", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#2089986694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "flush", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:6>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeStartObject", "java.lang.Object", "<d:1.5>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "\013\006", "<s:rcNz5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setCharacterEscapes", new String[]{"com.fasterxml.jackson.core.io.CharacterEscapes"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setFeatureMask", "int", "488"}}), new String[][]{{"writeNumber", "java.math.BigDecimal", "3"}, {"copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "short", "45"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"65536"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "+1", "32"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeEndArray", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:2>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_decodeSurrogate", "int,int", "-1090518911", "8416627"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "\r\r\013x7453", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1258841404", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"65536"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_decodeSurrogate", "int,int", "124", "512"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeString", "char[],int,int", "<sample:2>", "48", "65481"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectField", "java.lang.String,java.lang.Object", "i", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#241#-1677180103", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"137583648", "55295", "-4194228"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:8>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "canWriteObjectId", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:4>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "flush", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "\013\006", "a b"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#568446935", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:1>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,long", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.lang.String", ".5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "\u00e9", "56319"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_constructDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", ", exectinXg field name", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "double"}, new String[]{"wsite a\0370ull", "Infinity"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1753689690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartArray", new String[]{"int"}, new String[]{"90"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:6>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<i:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<sample:0>", "93", "35"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1356695930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:0>", "<sample:1>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", new String[]{"com.fasterxml.jackson.core.FormatSchema"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:3>", "<sample:9>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_releaseBuffers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "29696"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<sample:2>", "511", "488"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=32, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1655737911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "29952"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_verifyValueWrite", "java.lang.String", "a b"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,byte[],int,int", "<sample:7>", "<sample:2>", "511", "488"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "14976"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=8, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1113795123", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:0>", "56323", "-131"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "5014"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "/a/b", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:0>", "56323", "-131"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "-121044"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "/a/b", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<sample:0>", "56323", "-131"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.math.BigInteger", "-121044"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "8\013\010D1.1234678", "<s:b>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:8>", "<sample:9>", "<sample:0>", "47"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", "999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeFieldName", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "8\013\0101.B123467856320", "<d:1.5>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:8>", "<sample:9>", "<sample:3>", "107"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "java.lang.String", "9991.5d5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String"}, new String[]{"IwpC0Bc+dU2p\u00e80Cr"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1016577662", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "close", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "-107", "557028"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,float", "", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#239#-631659429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "close", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:4>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:2>", "-107", "557028"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,float", "57343", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#-1141747711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "close", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.5e00-1", "32790.015"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,long", "{\"a\":1", "-4398046445567"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#66170464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"65537"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"2147483648", "107", "-1073741823"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[]", "<sample:7>", "<sample:4>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1781035702", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeEndObject", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigDecimal"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", new String[]{"char[]", "int", "int"}, new String[]{"<sample:0>", "244", "32"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getFeatureMask", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", "java.lang.String", "\013\010"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", new String[]{"int"}, new String[]{"-1090518911"}, false), new String[][]{{"flush", "", "2"}, {"writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "6"}, {"getCodec", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-593850459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:11>", "true"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "flush", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "java.lang.String", "010"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:6>"}}), new String[][]{{"canWriteFormattedNumbers", "", "2"}, {"writeNumber", "long", "1"}, {"flush", "", "0"}, {"writeNull", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#786236457", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#786236457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"short"}, new String[]{"45"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,long", "3pBHB1c2+e\035dT2\u00e90520,20-02-p1TS2", "9998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#239#-631659429", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#239#-631659429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "useDefaultPrettyPrinter", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", ""}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}), new String[][]{{"useDefaultPrettyPrinter", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1823537125", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1823537125", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "java.math.BigDecimal"}, new String[]{"{{\"e!:1~", "473.066"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "8\013\010D1.1234678", "1.0"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "version", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", "com.fasterxml.jackson.core.PrettyPrinter", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<sample:0>", "581631", "2147483647"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "flush", ""}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "int", "960"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:0>", "-1073741824"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1304689355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:8>", "<sample:3>", "93"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "char", ")"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<empty>", "1049604", "265"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:7>", "<sample:3>", "2147483647"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<empty>", "-32504828", "265"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:3>", "-35", "-55298"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "enable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getHighestEscapedChar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<s:s>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:6>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1846691015", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"557028", "2147483647"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.lang.String", "+<552e96write a string"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeRaw", "java.lang.String", "-5"}}), new String[][]{{"getSchema", "", "5"}, {"writeBinary", "byte[]", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"35", "-2147483648"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.lang.String", "+<552e96write a string"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeRaw", "java.lang.String", ",5"}}), new String[][]{{"getSchema", "", "5"}, {"writeBinary", "byte[]", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1015100742", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1015100742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_asString", new String[]{"java.math.BigDecimal"}, new String[]{"65535"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeUTF8String", "byte[],int,int", "<sample:0>", "57344", "49"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:9>", "55295"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("65535", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-134572093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_asString", new String[]{"java.math.BigDecimal"}, new String[]{"56299.0"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeUTF8String", "byte[],int,int", "<sample:0>", "57348", "49"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:8>", "27647"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("56299.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1783276727", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_asString", new String[]{"java.math.BigDecimal"}, new String[]{"0.94"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:7>", "<sample:8>", "27647"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBooleanField", "java.lang.String,boolean", "{\"`nt", "false"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.94", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1092882258", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "char[],int,int", "<sample:4>", "44", "-32504828"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "\013\t", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-735303302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getFeatureMask", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", "char[],int,int", "<sample:4>", "44", "-32504828"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "\013\t", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1993205588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "double", "-7837.499999999998"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectId", "java.lang.Object", "<i:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=100, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#230#-1869506782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"java.math.BigInteger"}, new String[]{"-55296"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<null>", "56319", "34"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1304689355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCurrentValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", "int", "-488"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=100, getFormatFeatures=0, getHighestEscapedChar=0, getOu...#232#531591903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=255, getFormatFeatures=0, getHighestEscapedChar=127, get...#232#938058459", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "double[],int,int", "<sample:2>", "48", "35"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "close", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "close", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "float", "0.0"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeStartArray", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getCodec", ""}}, 2), new String[][]{{"useDefaultPrettyPrinter", "", "7"}, {"writeBinary", "byte[],int,int", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#126215069", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#126215069", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeUTF8String", new String[]{"byte[]", "int", "int"}, new String[]{"<sample:1>", "-47", "962"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getSchema", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "java.io.InputStream,int", "<sample:5>", "-2097114"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "y\007\007Y", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]"}, new String[]{"<sample:6>", "<sample:8>", "<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#172105791", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "wsite a\0370ull", "Infinity"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<null>"}}, 1), new String[][]{{"canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#2012173095", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,float", "wsite a\0370ull", "Infinity"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:1>", "-131", "49"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeTree", "com.fasterxml.jackson.core.TreeNode", "<sample:1>"}}, 1), new String[][]{{"getOutputContext", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=wsite a\0370ull, getEntryCount=1, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1431151995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "char[],int,int", "<null>", "512", "-1090518911"}}, 1), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#2069458703", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#2069458703", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:7>"}, false, 11, new String[][]{}, 2), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", ""}}, 2), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "j"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}}, 2), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}, {"setHighestNonEscapedChar", "int", "0"}, {"overrideStdFeatures", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#898070180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#898070180", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "11>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "4\014"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}}, 3), new String[][]{{"writeBooleanField", "java.lang.String,boolean", "1"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}, {"setHighestNonEscapedChar", "int", "4"}, {"overrideStdFeatures", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=214748364...#240#1742103961", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=214748364...#240#1742103961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setPrettyPrinter", new String[]{"com.fasterxml.jackson.core.PrettyPrinter"}, new String[]{"<sample:10>"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectFieldStart", "java.lang.String", "11>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", "java.lang.String", "4\014"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}}), new String[][]{{"setCharacterEscapes", "com.fasterxml.jackson.core.io.CharacterEscapes", "1"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}, {"setHighestNonEscapedChar", "int", "4"}, {"overrideStdFeatures", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=214748364...#240#1282825595", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=214748364...#240#1282825595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "byte[]", "int"}, new String[]{"<sample:4>", "<sample:5>", "<sample:1>", "669696"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,int", "y", "-31"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getCurrentValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("669694", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-357485578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArrayFieldStart", new String[]{"java.lang.String"}, new String[]{"\r\r\013x7453"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArrayFieldStart", "java.lang.String", "1.1234567"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#18028389", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<s:a>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<s:a>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<s:t>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "setCodec", "com.fasterxml.jackson.core.ObjectCodec", "<sample:1>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBoolean", new String[]{"boolean"}, new String[]{"true"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_writeSimpleObject", "java.lang.Object", "<s:t>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#2089986694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"94", "513"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String", "+1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"45", "513"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String", "+1A"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "canWriteObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.base.GeneratorBase", "canWriteObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "canWriteObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "canWriteObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1156296546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "canWriteObjectId", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1634521129", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":1t", "122", "59"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "write a null", "9998", "44"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "57343", "94"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{{\"a\":2.t", "1", "25"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "57343", "-2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":2.", "514", "2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "Hello, World", "<s:t>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":2.", "1049604", "2147483647"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "Hel\no, World", "<s:t>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1.5", "98", "-2147483648"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "-1.5", "<s:s>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getPrettyPrinter", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:6>", "<sample:2>", "10000"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "_checkStdFeatureChanges", "int,int", "0", "60"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#479558573", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "a", "<null>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "_checkStdFeatureChanges", "int,int", "0", "60"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#786236457", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "a", "<null>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "_checkStdFeatureChanges", "int,int", "0", "60"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#-1514586133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "_checkStdFeatureChanges", "int,int", "116", "60"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-116", "-2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-116", "-1073741823"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-116", "2147483647"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483645"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "-2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#771488447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483645"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "94", "55296"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-225583906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483645"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "94", "55296"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-225583906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483645"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#771488447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147482623", "2147483645"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=214748364...#239#300072681", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"xit0"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_verifyPrettyValueWrite", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "123456789012345678901234567890", "208"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an object", "-55296", "10000"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.4e300", "103.52"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an objfct", "56320", "10000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1281535465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\01455+22write raw value5.0"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectRef", "java.lang.Object", "<s:s>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "float", "123.041"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_flushBuffer", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-736780222", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"500.56"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"78397.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1717258625", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"78397.0"}, false, 15, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"783970.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"1567940.0"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"1567939.9999999998"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#19505309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"1567939.9999999998"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "93", "57342"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1438322330", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-5.9"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "char[],int,int", "<empty>", "93", "57342"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:8>", "<sample:0>", "<sample:1>", "65535"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"-7837.499999999998"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "useDefaultPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_flushBuffer", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<sample:8>", "<sample:0>", "<sample:1>", "93"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#19505309", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-1529334143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-1529334143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:1>", "false"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeNumberField", "java.lang.String,java.math.BigDecimal", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#81093978", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#81093978", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "copyCurrentStructure", "com.fasterxml.jackson.core.JsonParser", "<null>"}}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeNumberField", "java.lang.String,java.math.BigDecimal", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "false"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-1529334143", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-1529334143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:0>", "true"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=17, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1556390914", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=17, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1556390914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#63201884", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#63201884", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#2057346590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#2057346590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:2>", "true"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=20, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-1695619046", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=20, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-1695619046", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "true"}, false, 14, new String[][]{}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=80, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1018591188", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=80, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1018591188", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<null>", "true"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "double", "55296"}}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1161541587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-1161541587", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:3>", "true"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "double", "55296"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "char[],int,int", "<empty>", "9998", "92"}}, 1), new String[][]{{"configure", "com.fasterxml.jackson.core.JsonGenerator$Feature,boolean", "5"}, {"writeFieldName", "com.fasterxml.jackson.core.SerializableString", "2"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#2136353356", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=24, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#2136353356", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1t", " bye4s (out of "}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1t", " bye4s (out of "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1t", " bye4s (out of "}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1_t", " bye4s (out of "}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.math.BigDecimal", "117"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1_t", " bye4s (out of "}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.math.BigDecimal", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", "char", "\uffff"}}, 1), new String[][]{{"version", "", "2"}, {"isSnapshot", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1304689355", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1t", " bye4s (out of "}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObjectRef", "java.lang.Object", "<s:b>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.math.BigDecimal", "28149.5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "copyCurrentEvent", new String[]{"com.fasterxml.jackson.core.JsonParser"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStartObject", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeStringField", "java.lang.String,java.lang.String", "{\"a\":1t", " Wye4s (out of "}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumber", "java.math.BigDecimal", "0.1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRaw", "java.lang.String,int,int", "write a null", "488", "56321"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#737383235", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=7, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#228#602875868", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,int", "true", "55297"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canUseSchema", "com.fasterxml.jackson.core.FormatSchema", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#229#752346830", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,int", "t\nuf", "55296"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeString", "java.lang.String", "{\"a\":1}12:30:45"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#229#1960265005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "close", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNumberField", "java.lang.String,int", "t\nuf", "55296"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeString", "java.lang.String", "{\"a\":1}1l2:30:45"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=11, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#229#1960265005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeEndObject", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"48", "10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1431151995", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=10, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#1431151995", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483638, getFormatFeatures=0, getHighestEscapedChar=1...#240#1680839664", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483638, getFormatFeatures=0, getHighestEscapedChar=1...#240#1680839664", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, false), new String[][]{{"canWriteObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483638, getFormatFeatures=0, getHighestEscapedChar=1...#240#1680839664", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"93", "-10"}, false), new String[][]{{"canWriteObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=84, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#476589528", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"-2147483647", "-10"}, false), new String[][]{{"canWriteObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=-2147483648, getFormatFeatures=0, getHighestEscapedChar=...#239#1253596752", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1073741823", "-10"}, false), new String[][]{{"canWriteObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1073741814, getFormatFeatures=0, getHighestEscapedChar=1...#240#-65036092", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "overrideStdFeatures", new String[]{"int", "int"}, new String[]{"1073741823", "-20"}, false), new String[][]{{"canWriteObjectId", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1073741804, getFormatFeatures=0, getHighestEscapedChar=1...#240#-1715172891", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1783308810", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#2089986694", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeRawValue", "com.fasterxml.jackson.core.SerializableString", "<sample:2>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeObjectId", "java.lang.Object", "<sample:0>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getOutputTarget", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=3, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2047090399", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-35"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-35"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-35"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeBoolean", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"-35"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeBoolean", "boolean", "true"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,byte[],int", "<null>", "<sample:3>", "<sample:1>", "56320"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeBoolean", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_checkStdFeatureChanges", new String[]{"int", "int"}, new String[]{"94", "513"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String", "+1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":1}", "116", "59"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "write a null", "9998", "44"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "useDefaultPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getCodec", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_constructDefaultPrettyPrinter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":1t", "244", "59"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "write a null", "9998", "44"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "57343", "94"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":2.t", "488", "59"}, false, 3, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "write a null", "9998", "44"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "57343", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"{\"a\":2.", "1", "2147483647"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"65536"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1.5", "49", "-2147483647"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "-1.5", "<s:s>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getPrettyPrinter", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1.5", "98", "-2147483648"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "-1.5", "<s:s>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "getPrettyPrinter", ""}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString,boolean", "<sample:0>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", new String[]{"java.lang.String", "int", "int"}, new String[]{"-1.5", "87", "-2147483648"}, false, 12, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectField", "java.lang.String,java.lang.Object", "-1.5", "<s:r>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString,boolean", "<sample:0>", "false"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "int", "514"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:1>", "98", "90"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<null>", "<sample:0>", "-43", "60"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "byte[]", "int", "int"}, new String[]{"<sample:6>", "<sample:0>", "-43", "60"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1262187932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1262187932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:0>"}}), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1262187932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setCodec", new String[]{"com.fasterxml.jackson.core.ObjectCodec"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<empty>"}}), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=4, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1568865816", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:0>"}}), new String[][]{{"canWriteObjectId", "", "3"}, {"overrideFormatFeatures", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:0>"}}), new String[][]{{"canWriteObjectId", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1281535465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeBinary", "byte[]", "<sample:0>"}}), new String[][]{{"writeFieldName", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#639586775", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#639586775", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:1>"}, false, 10, new String[][]{}), new String[][]{{"writeFieldName", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-712609241", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-712609241", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteObjectId", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isEnabled", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:4>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getSchema", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeOmittedField", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:2>", "<sample:3>", "0"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-679494614", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:2>", "<sample:3>", "47"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "Cbc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:0>", "<sample:3>", "-47"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "Cbc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:0>", "<sample:3>", "-47"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "Cbc"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:0>", "<sample:3>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "Cbc"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "-55296"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:3>", "<empty>", "2147483647"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", "117"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "_throwInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:7>", "<empty>", "-2143289343"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-2023936509", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:6>", "<sample:3>", "-2143289343"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:8>", "<sample:3>", "-2143289343"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", ".5\r"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1590922812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"com.fasterxml.jackson.core.Base64Variant", "java.io.InputStream", "int"}, new String[]{"<sample:5>", "<sample:3>", "-2143289343"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeNullField", "java.lang.String", ".5\r"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawUTF8String", "byte[],int,int", "<sample:0>", "9998", "55296"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-1284244928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:6>", "<sample:2>", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:6>", "<sample:3>", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:6>", "<sample:2>", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-241961689", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "disable", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeUTF8String", "byte[],int,int", "<sample:0>", "-10", "31"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1451203928", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getPrettyPrinter", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", "com.fasterxml.jackson.core.Base64Variant,java.io.InputStream,int", "<sample:2>", "<sample:2>", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-29791803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "version", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.Version", actual.getClass().getName());
  assertEquals("2.7.7-SNAPSHOT {getArtifactId=jackson-core, getGroupId=com.fasterxml.jackson.core, getMajorVersion=2, getMinorVersion=7, getPatchLevel=7, isSnapshot=true, isUknownVersion=false, isUnknownVersion=false...#201#363144740", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "-232", "-2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"double[]", "int", "int"}, new String[]{"<sample:1>", "2147483647", "2147483645"}, false, 14, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", "double[],int,int", "<sample:0>", "94", "55296"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "getCurrentValue", ""}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=16, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#230#-225583906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeObject", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1273958434", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#64716195", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1476630926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "isClosed", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1156296546", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-720186272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canWriteFormattedNumbers", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "copyCurrentEvent", "com.fasterxml.jackson.core.JsonParser", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1580636318", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#709899778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeRawValue", new String[]{"java.lang.String", "int", "int"}, new String[]{"/a/b", "35", "124"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#583563965", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<empty>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "write a string", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1239034042", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "write a string", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<null>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "true", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,long", "<a>b</a>", "35"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinary", new String[]{"byte[]"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeBinaryField", "java.lang.String,byte[]", "true", "<sample:1>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", "com.fasterxml.jackson.core.SerializableString", "<sample:7>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", "java.lang.String,long", "<a>b</a>", "35"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:0>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483646, getFormatFeatures=0, getHighestEscapedChar=1...#240#1923107979", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483646, getFormatFeatures=0, getHighestEscapedChar=1...#240#1923107979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "configure", new String[]{"com.fasterxml.jackson.core.JsonGenerator$Feature", "boolean"}, new String[]{"<sample:6>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#967280550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#240#1541040495", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#240#1541040495", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#240#-1756854448", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#240#-1756854448", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:3>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}}), new String[][]{{"writeEndArray", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#240#543968142", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483639, getFormatFeatures=0, getHighestEscapedChar=1...#240#543968142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "disable", "com.fasterxml.jackson.core.JsonGenerator$Feature", "<sample:2>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}}), new String[][]{{"writeEndArray", "", "6"}, {"writeNumber", "long", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483643, getFormatFeatures=0, getHighestEscapedChar=1...#240#-2029500511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483643, getFormatFeatures=0, getHighestEscapedChar=1...#240#-2029500511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumberField", new String[]{"java.lang.String", "long"}, new String[]{"", "123"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "canOmitFields", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#519786888", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"int[]", "int", "int"}, new String[]{"<empty>", "43", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setHighestNonEscapedChar", "int", "511"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "getOutputTarget", ""}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.JsonWriteContext", actual.getClass().getName());
  assertEquals("/ {getCurrentIndex=0, getCurrentName=null, getEntryCount=0, getTypeDesc=ROOT}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=511, getOu...#231#-470199989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}}), new String[][]{{"writeEndArray", "", "6"}, {"writeNumber", "long", "1"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1092914341", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=2147483647, getFormatFeatures=0, getHighestEscapedChar=1...#240#1092914341", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}}), new String[][]{{"writeEndArray", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "setRootValueSeparator", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_writePPFieldName", "com.fasterxml.jackson.core.SerializableString", "<sample:5>"}, {"com.fasterxml.jackson.core.base.GeneratorBase", "writeArray", "long[],int,int", "<sample:1>", "1049604", "65536"}, {"com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeUTF8String", "byte[],int,int", "<null>", "-2147483648", "118"}}), new String[][]{{"writeEndArray", "", "6"}, {"writeNumber", "long", "1"}, {"writeBoolean", "boolean", "2"}, {"setFeatureMask", "int", "3"}});
  assertNotNull(actual);
  assertEquals("com.fasterxml.jackson.core.json.UTF8JsonGenerator", actual.getClass().getName());
  assertEquals("{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#881023680", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=1, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#881023680", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "123456789012345678901234567890", "91"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"writ0e raw value"}, false, 13, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRaw", "java.lang.String,int,int", "i", "488", "1049604"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeArray", "double[],int,int", "<null>", "124", "9999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=12, getFormatFeatures=0, getHighestEscapedChar=0, getOut...#231#-598033972", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"writ0"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_verifyPrettyValueWrite", "java.lang.String", ".5"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "123456789012345678901234567890", "208"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.123456778"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an object", "-55296", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#946264659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.123356778"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "long", "124"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an object", "-55296", "10000"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumberField", "java.lang.String,java.math.BigDecimal", "1.4e300", "103.52"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.fasterxml.jackson.core.JsonGenerationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"1.12335u6778"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "long", "124"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an object", "-55296", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#485509373", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an object", "56320", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#1281535465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "_throwInternal", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\014s"}, false, 10, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an objfct", "56320", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=9, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1709681594", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\013"}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an objfct", "56320", "10000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1474357818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.UTF8JsonGenerator", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeArray", new String[]{"long[]", "int", "int"}, new String[]{"<sample:2>", "125", "513"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeString", new String[]{"com.fasterxml.jackson.core.SerializableString"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#-1026864156", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\013563+20"}, false, 7, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectRef", "java.lang.Object", "<s:s>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeRawValue", "java.lang.String,int,int", "start an objfct", "56320", "10000"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "float", "123"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=6, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#-564179400", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\014553+22write raw value5."}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectRef", "java.lang.Object", "<s:s>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=5, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#230#1718119770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNullField", new String[]{"java.lang.String"}, new String[]{"\014553+22write raw value5."}, false, 6, new String[][]{{"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeObjectRef", "java.lang.Object", "<s:s>"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "writeNumber", "float", "123.041"}, {"com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_releaseBuffers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"125"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{canOmitFields=true, canWriteBinaryNatively=false, canWriteFormattedNumbers=false, canWriteObjectId=false, canWriteTypeId=false, getFeatureMask=0, getFormatFeatures=0, getHighestEscapedChar=0, getOutp...#229#276886081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.fasterxml.jackson.core.base.GeneratorBase", "com.fasterxml.jackson.core.json.UTF8JsonGenerator", "writeNumber", new String[]{"double"}, new String[]{"125"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
}
